package models;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Media extends Model {

    @Id
    private Long id;
    private String mime;
    @Constraints.Required
    private String link;
    private Media thumbnail;
    private String absoluteLink;

    private static Finder<String, Media> finder = new Finder<>(Media.class);

    public Media() {

    }

    public Media(Long id, String mime, String link, Media thumbnail) {
        this.id = id;
        this.mime = mime;
        this.link = link;
        this.thumbnail = thumbnail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public static Finder<String, Media> getFinder() {
        return finder;
    }

    public static void setFinder(Finder<String, Media> finder) {
        Media.finder = finder;
    }
}
