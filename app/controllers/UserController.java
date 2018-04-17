package controllers;

import models.users.Customer;
import models.users.User;
import models.users.Admin;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.userForm;
import views.html.profile;

import javax.inject.Inject;
import java.util.UUID;
import models.Cart;

public class UserController extends Controller{

    private FormFactory formFactory;

    @Inject
    public UserController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    public Result profile(int id) {
        return ok(profile.render(User.get(id), User.getWithEmail(session().get("email"))));
    }

    public Result create() {
        return ok(userForm.render(formFactory.form(User.class), User.getWithEmail(session().get("email"))));
    }

    public Result read() {
        return null;
    }

    public Result update(int id) {
        return ok(userForm.render(formFactory.form(User.class).fill(User.get(id)), User.getWithEmail(session().get("email"))));
    }

    public Result delete(int id) {
        User.get(id).delete();
        return redirect(routes.HomeController.store());
    }

    private Result form(Form<? extends User> form) {
        User user = form.get();
        if (user != null) {
            if (form.field("c").getValue().isPresent()) {
                String confirmPassword = form.field("c").getValue().get();
                if (!user.getPassword().equals(confirmPassword)) {
                    return ok("Bad confirmed password");
                }
            }
            if (user.getId() == null) {
                if (User.exists(user.getEmail())) {
                    user.setEmail("");
                    user.setPassword("");
                    flash("error", "Email already registred!");
                    return ok(userForm.render(formFactory.form(User.class).fill(user), User.getWithEmail(session().get("email"))));
                }
                user.save();
                flash("success", "User created!");
                return redirect(routes.LoginController.login());
            } else {
                user.update();
            }
        }
        flash("success", "Information Updated!");
        return redirect(routes.UserController.profile(user.getId()));
    }

    public Result admin() {
        return form(formFactory.form(Admin.class).bindFromRequest());
    }

    public Result customer() {
        return form(formFactory.form(Customer.class).bindFromRequest());
    }
}