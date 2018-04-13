package models;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Media {

    @Id
    private String id;
    private String mime;
    private String link;
    private Media thumbnail;
    private String absoluteLink;

    public Media() {

    }

    public Media(String id, String mime, String link, Media thumbnail) {
        this.id = id;
        this.mime = mime;
        this.link = link;
        this.thumbnail = thumbnail;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMime() {
        return mime;
    }

    public void setMime(String mime) {
        this.mime = mime;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Media getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Media thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getAbsoluteLink() {
        return absoluteLink;
    }

    public void setAbsoluteLink(String absoluteLink) {
        this.absoluteLink = absoluteLink;
    }
}
