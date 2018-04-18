package controllers;

import play.mvc.*;

public class Payment extends Controller {

    public Result payment() {
        //for (Game game: user.getBasket().getGames())
        return ok("Paid");
    }
}