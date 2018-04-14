package models;

import io.ebean.Model;
import io.ebean.Finder;

import javax.persistence.*;
import java.util.List;

import models.users.User;
import java.sql.Timestamp;

@Entity
public class Thread extends Model {

    @Id
    private String id;
    private String title;
    private User poster;
    private Timestamp lastReply;

    //@OneToMany(mappedBy = "thread")
    @ManyToOne(cascade = CascadeType.ALL)
    private Forum forum;

    @OneToMany(mappedBy = "thread")
    private List<Post> posts;

    private static Finder<String, Thread> finder = new Finder<>(Thread.class);

    public Thread(String id, String title, User poster, Timestamp lastReply, List<Post> posts) {
        this.id = id;
        this.title = title;
        this.poster = poster;
        this.lastReply = lastReply;
        this.posts = posts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Timestamp getLastReply() {
        return lastReply;
    }

    public void setLastReply(Timestamp lastReply) {
        this.lastReply = lastReply;
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

    public static Finder<String, Thread> getFinder() {
        return finder;
    }

    public static void setFinder(Finder<String, Thread> finder) {
        Thread.finder = finder;
    }
}
