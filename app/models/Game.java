package models;

import io.ebean.*;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Column;
import java.text.DecimalFormat;

import java.util.List;

@Entity
public class Game extends Model {

    @Id
    private Long id;
    private String title;

    @Column(columnDefinition = "LONGVARCHAR")
    private String description;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Media> media;

    private double price;
    private double rating;
    private double discount;
    private boolean visible;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private List<Thread> threads;

    private static Finder<Long, Game> finder = new Finder<>(Game.class);

    public Game(String title, String description, double price, double rating, double discount, boolean visible) {
        this.title = title;
        this.description = description;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
        this.visible = visible;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public List<Media> getMedia() {
        return media;
    }

    public void setMedia(List<Media> media) {
        this.media = media;
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

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public boolean getVisible() {
        return visible;
    }

    public void setVisible(boolean isVisible) {
        this.visible = isVisible;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    public static Finder<Long, Game> getFinder() {
        return finder;
    }

    public static Game get(Long id) {
        return finder.ref(id);
    }

    public static List<Game> all() {
        return finder.all();
    }

    public static List<Game> search(String query) {
        return Game.finder.query().where()
                .ilike("title", String.format("%%%s%%", query))
                .findList();
    }

    public double getDiscountedPrice() {
        return Double.valueOf(new DecimalFormat("#.##").format(price - price * discount));
    }

}
