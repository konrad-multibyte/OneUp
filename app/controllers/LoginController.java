package controllers;

import models.users.Login;
import models.users.User;
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
        return ok(login.render(formFactory.form(Login.class)));
    }

    public Result form() {
        Login login = formFactory.form(Login.class).bindFromRequest().get();
        if (login != null) {
            if (User.auth(login.getEmail(), login.getPassword())) {
                redirect(routes.HomeController.index());
            }
        }
        return redirect(routes.LoginController.login());
    }

    public Result logout() {
        session().clear();
        return redirect(routes.HomeController.index());
    }
}
