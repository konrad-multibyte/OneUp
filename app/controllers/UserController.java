package controllers;

import models.users.Customer;
import models.users.User;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.userForm;
import views.html.profile;

import javax.inject.Inject;
import java.util.UUID;

public class UserController extends Controller implements CRUD{

    private FormFactory formFactory;

    @Inject
    public UserController(FormFactory formFactory) {
        this.formFactory = formFactory;
    }


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
        Form<Customer> form = formFactory.form(Customer.class).bindFromRequest();
        Customer user = form.get();
        if (user != null) {
            if (form.field("c").getValue().isPresent()) {
                String confirmPassword = form.field("c").getValue().get();
                if (!user.getPassword().equals(confirmPassword)) {
                    return ok("Bad confirmed password");
                }
            }
            if (user.getId().equals("")) {
                user.setId(UUID.randomUUID().toString());
                user.save();
                return ok("User created");
            } else {
                user.update();
            }
        }
        return ok("User updated");
    }
}
