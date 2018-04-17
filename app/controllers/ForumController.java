package controllers;

import io.ebean.*;

import models.Game;
import models.Thread;
import models.users.User;
import play.api.Environment;
import play.data.Form;
import play.data.FormFactory;
import play.data.DynamicForm;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.userForm;
import views.html.profile;

import javax.inject.Inject;

public class ForumController extends Controller{

    private Environment environment;
    private FormFactory formFactory;

    @Inject
    public ForumController(Environment environment, FormFactory formFactory) {
        this.environment = environment;
        this.formFactory = formFactory;
    }

    public Result create(Long id) {
        DynamicForm form = formFactory.form().bindFromRequest();
        String title = form.get("title");
        String content = form.get("content");
        Game game = Game.getFinder().byId(id.toString());
        Ebean.save(new Thread(title, User.getWithEmail(session("email")), game, content));
        return ok(views.html.forum.render(User.getWithEmail(session("email")), game, environment));
    }

    public Result read() {
        return null;
    }

    public Result update(int id) {
        return null;
    }

    public Result delete(String id) {
        Ebean.delete(Thread.getFinder().byId(id));
        return ok();
    }

    private Result form(Form<? extends Thread> form) {
        return null;
    }
}