package controllers;

import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.login;

import javax.inject.Inject;

public class LoginController extends Controller {

    private FormFactory formFactory;

    @Inject
    public LoginController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    public Result login() {
        return ok(login.render(formFactory.form(User.class), User.getWithEmail(session().get("email"))));
    }

    public Result form() {
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        User user = userForm.get();
        if (user != null) {
            if (User.auth(user.getEmail(), user.getPassword())) {
                session().put("email", user.getEmail());
                return redirect(routes.HomeController.store());
            }
            return redirect(routes.LoginController.login());
        }
        return redirect(routes.LoginController.login());
    }

    public Result logout() {
        session().clear();
        flash("success", "You have been signed out.");
        return redirect(routes.HomeController.store());
    }
}
