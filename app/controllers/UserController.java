package controllers;

import io.ebean.DuplicateKeyException;
import models.users.Customer;
import models.users.User;
import models.users.Admin;
import play.data.DynamicForm;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.*;

import views.html.userForm;
import views.html.profile;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserController extends Controller{

    private FormFactory formFactory;

    @Inject
    public UserController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


    public Result profile(int id) {
        User user = User.get(id);
        if(user.getSuspendedUntil() != null) {
            if(user.getSuspendedUntil().after(new Date())) {
                user.unlock();
            }
        }
        return ok(profile.render(user, User.getWithEmail(session().get("email"))));
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

    @Security.Authenticated(Secure.class)
    private Result form(Form<? extends User> form) {
        User user = form.get();
        if (user != null) {
            if (form.field("c").getValue().isPresent()) {
                String confirmPassword = form.field("c").getValue().get();
                if (!user.getPassword().equals(confirmPassword)) {
                    user.setPassword("");
                    flash("error", "Passwords dont match");
                    return ok(userForm.render(formFactory.form(User.class).fill(user), User.getWithEmail(session().get("email"))));
                }
            }
            try {
                user.save();
                flash("success", "User created!");
                return redirect(routes.LoginController.login());
            } catch (DuplicateKeyException e) {
                user.update();
                flash("success", "Information Updated!");
                return redirect(routes.UserController.profile(user.getId()));
            }
        }
        flash("error", "Unknown error.");
        return redirect(routes.HomeController.store());
    }

    public Result suspend() {
        DynamicForm form = formFactory.form().bindFromRequest();
        User user = User.get(Integer.valueOf(form.get("id")));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(form.get("date"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.suspend(date);
        user.update();
        flash("success", String.format("(# %d) User account %s was suspended until %s.", user.getId(), user.getUsername(), format.format(date)));
        return redirect(routes.UserController.profile(user.getId()));
    }

    public Result unlock(Integer id) {
        User user = User.get(id);
        user.unlock();
        user.update();
        flash("success", String.format("(# %d) User account %s was suspended.", user.getId(), user.getUsername()));
        return redirect(routes.UserController.profile(user.getId()));
    }

    public Result admin() {
        return form(formFactory.form(Admin.class).bindFromRequest());
    }

    public Result customer() {
        return form(formFactory.form(Customer.class).bindFromRequest());
    }
}