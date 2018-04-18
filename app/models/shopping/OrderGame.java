package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.Game;
import models.users.*;

@Entity
public class OrderGame extends Model{
    @Id
    private Long id;

    @ManyToOne
    private ShopOrder order;

    @ManyToOne
    private Basket basket;

    @ManyToOne
    private Game game;

    private int quantity;
    private double price;

    public OrderGame(){

    }
    public OrderGame(Game g){
        game = g;
        quantity = 1;
        price = g.getPrice();
    }
    public void decreaseQty(){
        quantity -= 1;
    }

    public double getGameTotal(){
        return this.price * this.quantity;
    }
    public static Finder<Long, OrderGame> find = new Finder<Long,OrderGame>(OrderGame.class);

    public static List<OrderGame> findAll(){
        return OrderGame.find.all();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ShopOrder getOrder() {
        return order;
    }

    public void setOrder(ShopOrder order) {
        this.order = order;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}