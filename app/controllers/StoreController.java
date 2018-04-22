package controllers;

import models.*;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
import play.api.Environment;
import play.api.mvc.MultipartFormData;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;

import javax.inject.Inject;

import java.io.File;
import java.util.List;

import io.ebean.*;

public class StoreController extends Controller {

    private FormFactory formFactory;

    @Inject
    public StoreController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result create() {
        DynamicForm form = formFactory.form().bindFromRequest();


        String title = form.get("title");
        String description = form.get("content");
        double price = Double.valueOf(form.get("price"));
        String d = form.get("discount");
        double discount = 0;
        if (!d.equals("")) {
            discount = Double.valueOf(d) / 100;
        }
        boolean isVisible = Boolean.valueOf(form.get("isVisible"));
        Game game = new Game(title, description, price, 50.0, discount, isVisible);
        if(!form.get("id").equals("")) {
            game.setId(Long.valueOf(form.get("id")));
        }
        Http.MultipartFormData mfd = request().body().asMultipartFormData();
        parseImages(game, mfd.getFiles());

        try {
            game.save();
            flash("success", String.format("Game %s has been created.", game.getTitle()));
        } catch (DuplicateKeyException e) {
            game.update();
            flash("success", String.format("Game %s has been updated", game.getTitle()));
        }


        return redirect(routes.HomeController.store());
    }

    @Transactional
    @Security.Authenticated(Secure.class)
    @With(Auth.Administrator.class)
    public Result removeGame(Long id) {
        Game game = Game.get(id);
        flash("success", String.format("(# %d) %s has been deleted", game.getId(), game.getTitle()));
        game.delete();
        return redirect(routes.HomeController.store());
    }

    @Transactional
    @Security.Authenticated(Secure.class)
    @With(Auth.Administrator.class)
    public Result hideGame(Long id) {
        Game game = Game.get(id);

        if(game.getVisible()) {
            game.setVisible(false);
            flash("success", String.format("(# %d) %s has been revealed.", game.getId(), game.getTitle()));
        } else {
            game.setVisible(true);
            flash("success", String.format("(# %d) %s has been hidden.", game.getId(), game.getTitle()));
        }
        game.update();
        return redirect(routes.HomeController.store());
    }

    private void parseImages(Game game, List list) {
        game.getMedia().clear();
        String relative = "/images/game/";
        boolean cover = false;
        for (Object object : list) {
            Http.MultipartFormData.FilePart filePart = (Http.MultipartFormData.FilePart) object;
            String mime = filePart.getContentType();
            if (mime.startsWith("image/")) {
                File file = ((File) filePart.getFile());
                Media image = new Media();
                image.save();

                // Define directories
                String gameImages = String.format( "%s%d/", relative, game.getId());
                String gameThumbs = gameImages + "thumbs/";
                File dir = new File("public/" + gameThumbs);
                if (!dir.exists()) {
                    dir.mkdirs();
                }

                // Full size image
                IMOperation op = new IMOperation();
                op.addImage(file.getAbsolutePath());
                op.resize(300, 200);
                String fullImage = String.format("%s%s.jpg", gameImages, image.getId());
                op.addImage("public" + fullImage);

                // Thumbnail of full size image
                IMOperation thumb = new IMOperation();
                thumb.addImage(file.getAbsolutePath());
                thumb.resize(60);
                String thumbImage =  String.format("%s%s.jpg", gameThumbs, image.getId());

                thumb.addImage("public" + thumbImage);

                Media thumbImg = new Media(filePart.getContentType(), thumbImage, null);

                // Execute making of both images
                try {
                    ConvertCmd cmd = new ConvertCmd();
                    cmd.run(op);
                    cmd.run(thumb);
                    if (!cover) {
                        image.setMime(mime + "/cover");
                        cover = true;
                    } else  {
                        image.setMime(mime);
                    }
                    // Assign images
                    image.setLink(fullImage);
                    image.setThumbnail(thumbImg);
                    image.update();
                    // Add media to game
                    game.getMedia().add(image);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}