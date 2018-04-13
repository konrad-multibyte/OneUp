package controllers;

import models.*;
import models.users.*;
import play.api.Environment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.*;
import play.Logger;

import javax.inject.Inject;
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
     * <code>GET</code> request with a path of <code>/</code>
     */

    private Environment environment;
    private FormFactory formFactory;

    @Inject
    public HomeController(Environment environment, FormFactory formFactory) {
        this.environment = environment;
        this.formFactory = formFactory;
    }

    public Result index() {
        return ok(views.html.index.render(User.getWithEmail(session().get("email"))));
    }

    public Result game(Long id) {
        Game game = Game.getFinder().byId(id.toString());
        return ok((views.html.game.render(User.getWithEmail(session().get("email")), game, environment)));
    }

    public Result store() {
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), Game.all(), environment));
    }

    public Result payment(){
        Game game = Game.getFinder().byId("1");
        return ok(views.html.Payment.render(User.getWithEmail(session().get("email")),game, environment));
    }

    public Result search() {
        DynamicForm form = formFactory.form().bindFromRequest();
        String query = form.get("query");
        String price = form.get("pRange");
        String rating = form.get("rRange");
        return ok(views.html.store.render(User.getWithEmail(session().get("email")), Game.search(query, price, rating), environment));
    }
}
