package models.shopping;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import models.users.*;
import models.Game;


@Entity
public class Basket extends Model{
    @Id
    private Long id;

    @ManyToMany
    private List<Game> basketItems = new ArrayList<>();

    @OneToOne
    private User user;

    public Basket(){

    }

    public void addGame(Game g){
        boolean gameFound = false;
        for(Game i : basketItems){
            if(i.getId() == g.getId()){
                gameFound = true;
                break;
            }
        }
        if(gameFound == false ){
            basketItems.add(g);
        }
    }

    public void removeGame(Game game){

        for(Iterator<Game> iter = basketItems.iterator(); iter.hasNext();){
            Game g = iter.next();
            if(g.getId().equals(game.getId())){
                g.delete();
                iter.remove();
                break;
            }
        }
    }
    

    public void removeAllItems(){
        for(Game i: this.basketItems){
            i.delete();
        }
        this.basketItems = null;
    }

    public List<Game> getBasketItems(){

        return basketItems;
    }

    public double getBasketTotal(){
        double total = 0.0;
        if (basketItems.isEmpty()) {
            return 0;
        }
        for(Game game: basketItems) {
            total += game.getPrice();
        }
        return total;
    }

    public static Finder<Long,Basket> find = new Finder<Long,Basket>(Basket.class);

    public static List<Basket> findall(){
        return Basket.find.all();
    }

    public User getUser(){
        return usetr;
    }

    public void setUser(User user){
        this.user = user;
    }
}
