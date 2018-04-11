package controllers;

import models.users.Customer;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.*;
import views.html.userForm;
import views.html.profile;
import views.html.login;
import javax.inject.Inject;
import java.util.UUID;

public class UserController extends Controller implements CRUD{

    private FormFactory formFactory;

    @Inject
    public UserController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }

    @Security.Authenticated(Secured.class)
    public Result profile(String id) {
        return ok(profile.render(User.get(id), User.getWithEmail(session().get("email"))));
    }

    @Override
    public Result create() {
        return ok(userForm.render(formFactory.form(User.class), User.getWithEmail(session().get("email"))));
    }

    @Override
    public Result read() {
        return null;
    }

    @Override
    public Result update(String id) {
        return ok(userForm.render(formFactory.form(User.class).fill(User.get(id)), User.getWithEmail(session().get("email"))));
    }

    @Override
    public Result delete(String id) {
        User.get(id).delete();
        return redirect(routes.HomeController.index());
    }

    @Override
    public Result form() {
        Form<User> form = formFactory.form(User.class).bindFromRequest();
        User user = form.get();
        if (user != null) {
            if (form.field("c").getValue().isPresent()) {
                String confirmPassword = form.field("c").getValue().get();
                if (!user.getPassword().equals(confirmPassword)) {
                    return ok(userForm.render());
                }
            }
            if (user.getId().equals("")) {
                user.setId(UUID.randomUUID().toString());
                user.save();
                return ok(login.render(formFactory.form(User.class), "User created"));
            } else {
                user.update();
            }
        }
        return redirect(routes.UserController.profile(user.getId));
    }
}
