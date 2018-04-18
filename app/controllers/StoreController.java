package controllers;

import models.*;
import models.Thread;
import models.users.*;
import play.api.Environment;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import io.ebean.*;

public class StoreController extends Controller {

    private Environment environment;
    private FormFactory formFactory;

    @Inject
    public StoreController(Environment environment, FormFactory formFactory) {
        this.environment = environment;
        this.formFactory = formFactory;
    }

    public Result create() {

        return ok(views.html.store.render(User.getWithEmail(session("email")), Game.all(), environment));
    }
}
