package models;

import io.ebean.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import models.users.User;
import play.Logger;

import java.sql.Timestamp;

import static play.mvc.Controller.session;

@Entity
public class Thread extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    private User poster;

    @ManyToOne(cascade = CascadeType.ALL)
    private Game game;

    @OneToMany(mappedBy = "thread", cascade = CascadeType.ALL)
    private List<Post> posts;

    private static Finder<String, Thread> finder = new Finder<>(Thread.class);

    public Thread(String title, Game game, String content) {
        this.title = title;
        this.poster = User.getWithEmail(session().get("email"));
        this.game = game;
        posts = new ArrayList<>();
        posts.add(new Post(content, this));
        Ebean.save(this);
    }

    public String getLastReply() {
        if(posts.size() != 0) {
            return posts.get(posts.size() - 1).getTimePostedString();
        }
        return null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public Game getGame() {
        return game;
    }

    public static Finder<String, Thread> getFinder() {
        return finder;
    }

    public static void setFinder(Finder<String, Thread> finder) {
        Thread.finder = finder;
    }
}
