package controllers;

import models.*;
import models.users.*;
import play.mvc.*;
import java.util.ArrayList;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render(User.getWithEmail(session().get("email"))));
    }

    public Result game(Long id) {
        Game game = Game.getFinder().byId(id.toString());
        return ok((views.html.game.render(User.getWithEmail(session().get("email")), game)));
    }

    public Result store() {
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), Game.all()));
    }
}
