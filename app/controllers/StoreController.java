package controllers;

import models.*;
import org.im4java.core.ConvertCmd;
import org.im4java.core.IMOperation;
import play.api.Environment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Http;
import play.mvc.Result;

import javax.inject.Inject;

import java.io.File;
import java.util.List;

import io.ebean.*;

public class StoreController extends Controller {

    private Environment environment;
    private FormFactory formFactory;

    @Inject
    public StoreController(Environment environment, FormFactory formFactory) {
        this.environment = environment;
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
            discount = Double.valueOf(d);
        }
        boolean isVisible = Boolean.valueOf(form.get("isVisible"));
        Game game = new Game(title, description, null, price, 50.0, discount, isVisible);
        Http.MultipartFormData mfd = request().body().asMultipartFormData();

        parseImages(game, mfd.getFiles());

        Ebean.save(game);
        return redirect(routes.HomeController.store());
    }

    private void parseImages(Game game, List<Http.MultipartFormData.FilePart> list) {
        String relative = "/images/game/";
        boolean cover = false;
        for (Http.MultipartFormData.FilePart filePart : list) {
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