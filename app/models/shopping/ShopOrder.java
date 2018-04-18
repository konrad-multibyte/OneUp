package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import java.util.Calendar;

import models.users.*;
import models.Game;

@Entity
public class ShopOrder extends Model{
    @Id
    private Long id;

    private Calendar OrderDate;

    @OneToMany(mappedBy="order", cascade = CascadeType.ALL)
    private List<OrderGame> game;

    @ManyToOne
    private Customer customer;

    public ShopOrder(){
        OrderDate = Calendar.getInstance();
    }

    public int getOrderTotal(){

        return game.size();
    }

    public static Finder<Long,ShopOrder> find = new Finder<Long,ShopOrder>(ShopOrder.class);

    public static List<ShopOrder> findAll() {
        return ShopOrder.find.all();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Calendar getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        OrderDate = orderDate;
    }

    public List<OrderGame> getGame() {
        return game;
    }

    public void setItems(List<OrderGame> game) {
        this.game = game;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    } 

}