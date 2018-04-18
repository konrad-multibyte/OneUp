package controllers;

import play.mvc.*;
import play.data.*;
import javax.inject.Inject;


import views.html.*;
import play.db.ebean.Transactional;
import play.api.Environment;

import models.users.*;
import models.Game;
import models.shopping.*;



public class ShoppingCtrl extends Controller{
    private FormFactory formFactory;

    private Environment env;

    @Inject
    public ShoppingCtrl(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }
        private Customer getCurrentUser(){
            return (Customer)User.getWithEmail(session().get("email"));

        }

        @Transactional
        public Result showBasket(){
            return ok(basket.render(getCurrentUser()));
        }

        @Transactional
        public Result addToBasket(Long id){
            Game game = Game.getFinder().byId(id.toString());
            Customer customer = (Customer)User.getWithEmail(session().get("email"));

            if(customer.getBasket() == null){
                customer.setBasket(new Basket());
                customer.getBasket().setCustomer(customer);
                customer.update();
            }
            return ok(basket.render(customer));
        }
        @Transactional
        public Result removeOne(String gameId){
            Game game = Game.getFinder().byId(gameId);
            Customer c = getCurrentUser();
            c.getBasket().removeGame(game);
            c.getBasket().update();

            return ok(basket.render(c));
        }

        @Transactional 
        public Result emptyBasket(){
            Customer c = getCurrentUser();
            c.getBasket().removeAllItems();
            c.getBasket().update();

            return ok(basket.render(c));
        }
        @Transactional
        public Result viewOrder(Long id){
            ShopOrder order = ShopOrder.find.byId(id);
            return ok(orderConfirmed.render(getCurrentUser(), order));
        }

    
}