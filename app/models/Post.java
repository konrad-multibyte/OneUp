package models;

import io.ebean.Model;
import models.users.User;
import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Post extends Model {

    @Id
    private String id;
    private User poster;
    private String text;
    private Timestamp timePosted;

    public Post(String id, User poster, String text, Timestamp timePosted) {
        this.id = id;
        this.poster = poster;
        this.text = text;
        this.timePosted = timePosted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
