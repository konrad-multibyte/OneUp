package controllers;

import models.*;
import models.Thread;
import models.users.*;
import play.api.Environment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import io.ebean.*;


/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>
     */

    private Environment environment;
    private FormFactory formFactory;

    @Inject
    public HomeController(Environment environment, FormFactory formFactory) {
        this.environment = environment;
        this.formFactory = formFactory;
    }

    public Result game(Long id) {
        Game game = Game.getFinder().byId(id);
        return ok((views.html.game.render(User.getWithEmail(session().get("email")), game, environment)));
    }

    public Result store() {
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), Game.all(), environment));
    }

    public Result addToCart(Long id) {
        if (session().get("email") == null) {
            return redirect(routes.LoginController.login());
        }
        User.getWithEmail(session().get("email")).getCart().getGames().add(Game.get(id));
        return redirect(routes.HomeController.store());
    }

    public Result removeFromCart(Long id) {
        if (session().get("email") == null) {
            return redirect(routes.LoginController.login());
        }
        User.getWithEmail(session().get("email")).getCart().getGames().remove(Game.get(id));
        return redirect(routes.HomeController.store());
    }

    public Result checkout() {
        User.getWithEmail(session().get("email")).getCart().checkout();
        // TODO: Credit card verification
        return redirect("Credit card?");
    }

    public Result search() {
        DynamicForm form = formFactory.form().bindFromRequest();
        String query = form.get("query");
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), Game.search(query), environment));
    }

    public Result forum(Long id) {
        Game game = Game.getFinder().byId(id);
        return ok(views.html.forum.render(User.getWithEmail(session().get("email")), game, environment));
    }

    public Result thread(Long id) {
        models.Thread thread = models.Thread.getFinder().byId(id.toString());
        return ok(views.html.thread.render(User.getWithEmail(session().get("email")), thread, environment));
    }

}
