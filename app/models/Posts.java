package models;

import io.ebean.Model;
import models.users.User;
import org.joda.time.DateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posts extends Model {

    @Id
    private String id;
    private User poster;
    private String text;
    private DateTime dateTime;

    public Posts(String id, User poster, String text, DateTime dateTime) {
        this.id = id;
        this.poster = poster;
        this.text = text;
        this.dateTime = dateTime;
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

    public DateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(DateTime dateTime) {
        this.dateTime = dateTime;
    }
}
