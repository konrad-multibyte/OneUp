package models;

import io.ebean.Finder;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {

    @Id
    private Long id;

    @ManyToMany
    private List<Game> games;

    private double total;

    private static Finder<String, Cart> finder = new Finder<>(Cart.class);

    public Cart(List<Game> games) {
        this.games = games;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
