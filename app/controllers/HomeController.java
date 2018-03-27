package controllers;

import models.users.User;
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

    public Result game() {
        return ok(views.html.game.render(User.getWithEmail(session().get("email")),
                new models.Game("5", "The Elder Scrolls VI: Skyrim 2", "literally the " +
                        "same as skyrim but we remastered it and made you pay for mods", null,
                        59.99, 89, null)));
    }

    public Result store() {
        ArrayList<models.Game> gameList = new ArrayList<>();
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), gameList));
    }
}
