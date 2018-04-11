package controllers;

import models.users.Login;
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
        return ok(login.render(formFactory.form(User.class), null));
    }

    public Result form() {
        String error = "Invalid email and/or password.";
        Form<User> userForm = formFactory.form(User.class).bindFromRequest();
        User user = userForm.get();
        if (user != null) {
            if (User.auth(user.getEmail(), user.getPassword())) {
                session().put("email", user.getEmail());
                return redirect(routes.HomeController.index());
            }
        }
        return ok(login.render(formFactory.form(User.class), error));
    }

    public Result logout() {
        if (session().get("email") == null) {
            return ok(login.render(formFactory.form(User.class), "Not signed in."));
        }
        session().clear();
        return ok(login.render(formFactory.form(User.class), "Logged out."));
    }
}
