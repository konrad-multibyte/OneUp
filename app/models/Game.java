package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.List;

@Entity
public class Game extends Model{

    @Id
    private String id;
    private String title;
    private String description;
    private List<String> gameTags;
    private double price;
    private double rating;

    @OneToOne
    private ForumThread thread;

    private static Finder<String, Game> finder = new Finder<>(Game.class);

    public Game(String id, String title, String description, List<String> gameTags, double price, double rating, ForumThread thread) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.gameTags = gameTags;
        this.price = price;
        this.rating = rating;
        this.thread = thread;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getGameTags() {
        return gameTags;
    }

    public void setGameTags(List<String> gameTags) {
        this.gameTags = gameTags;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public ForumThread getThread() {
        return thread;
    }

    public void setThread(ForumThread thread) {
        this.thread = thread;
    }

    public static Finder<String, Game> getFinder() {
        return finder;
    }

    public static Game get(String id) {
        return finder.ref(id);
    }
}
