package models;

import io.ebean.Finder;
import models.users.User;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Cart {

    @Id
    private String id;

    @ManyToMany
    private List<Game> games;

    private double total;

    private static Finder<String, Cart> finder = new Finder<>(Cart.class);

    public Cart(String id) {
        this.id = id;
    }

    public Cart(String id, List<Game> games) {
        this(id);
        this.games = games;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public double getTotal() {
        games.forEach(game -> total += game.getDiscountedPrice());
        return total;
    }

    public static Finder<String, Cart> getFinder() {
        return finder;
    }

    public void checkout() {
        // TODO: Add transaction logic
    }

    public static Cart get(String id) {
        return finder.ref(id);
    }


}
