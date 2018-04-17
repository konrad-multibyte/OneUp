package models;

import io.ebean.*;

import models.users.User;
import java.sql.Timestamp;

import javax.persistence.*;

@Entity
public class Post extends Model {

    @Id
    private Long id;
    private User poster;
    @Column(columnDefinition = "LONGVARCHAR")
    private String text;

    private Timestamp timePosted;

    @ManyToOne(cascade = CascadeType.ALL)
    private Thread thread;

    public Post(User poster, String text, Thread thread) {
        this.poster = poster;
        this.text = text;
        this.thread = thread;
        timePosted = new Timestamp(System.currentTimeMillis());
        Ebean.save(this);
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

    public void setTimePosted(Timestamp timePosted) {
        this.timePosted = timePosted;
    }
}
