package controllers;

import models.users.Customer;
import models.users.User;
import models.users.Admin;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import views.html.userForm;
import views.html.profile;

import javax.inject.Inject;

public class UserController extends Controller{

    private FormFactory formFactory;

    @Inject
    public UserController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    public Result profile(Integer id) {
        return ok(profile.render(User.get(id), User.getWithEmail(session().get("email"))));
    }

    public Result create() {
        return ok(userForm.render(formFactory.form(User.class), User.getWithEmail(session().get("email"))));
    }

    public Result update(Integer id) {
        return ok(userForm.render(formFactory.form(User.class).fill(User.get(id)), User.getWithEmail(session().get("email"))));
    }

    public Result delete(Integer id) {
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
            System.out.println(user.getId());
            if (user.getId() == null) {
                if (User.exists(user.getEmail())) {
                    user.setEmail("");
                    user.setPassword("");
                    flash("error", "Email already registered!");
                    return ok(userForm.render(formFactory.form(User.class).fill(user), User.getWithEmail(session().get("email"))));
                }
                user.save();
                flash("success", "User created!");
                return redirect(routes.LoginController.login());
            } else {
                user.update();
            }
            flash("success", "Information Updated!");
            return redirect(routes.UserController.profile(new Integer(user.getId())));
        }
        flash("error", "Unknown error.");
        return redirect(routes.HomeController.store());
    }

    public Result admin() {
        return form(formFactory.form(Admin.class).bindFromRequest());
    }

    public Result customer() {
        return form(formFactory.form(Customer.class).bindFromRequest());
    }
}