package models;

import io.ebean.*;

import models.users.User;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.*;

import static play.mvc.Controller.session;

@Entity
public class Post extends Model {

    @Id
    private Long id;

    @ManyToOne
    private User poster;
    @Column(columnDefinition = "LONGVARCHAR")
    private String text;

    private Timestamp timePosted;

    @ManyToOne
    private Thread thread;

    private static Finder<Long, Post> finder = new Finder<>(Post.class);

    public Post(String text, Thread thread) {
        this.poster = User.getWithEmail(session().get("email"));
        this.text = text;
        this.thread = thread;
        timePosted = new Timestamp(System.currentTimeMillis());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getPoster() {
        return poster;
    }

    public void setPoster(User poster) {
        this.poster = poster;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Timestamp getTimePosted() {
        return timePosted;
    }

    public String getTimePostedString() {
        return new SimpleDateFormat("dd-MM-yyyy HH:mm").format(timePosted);
    }

    public void setTimePosted(Timestamp timePosted) {
        this.timePosted = timePosted;
    }

    public static Finder<Long, Post> getFinder() {
        return finder;
    }

    public static void setFinder(Finder<Long, Post> finder) {
        Post.finder = finder;
    }
    public Thread getThread() {
        return thread;
    }

    public static List<Post> getPostsByUser(Integer id) {
        return Post.finder.query().where().eq("poster_id", id).findList();
    }
}
