package models;

import io.ebean.Finder;
import io.ebean.Model;


import javax.persistence.*;
import java.util.List;

@Entity
public class Forum extends Model {

    @Id
    private String id;

    //@ManyToOne(cascade = CascadeType.ALL)
    @OneToMany(mappedBy = "forum")
    private List<Thread> threads;

    private static Finder<String, Forum> finder = new Finder<>(Forum.class);

    public Forum(String id, List<Thread> threads) {
        this.id = id;
        this.threads = threads;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Thread> getThreads() {
        return threads;
    }

    public void setThreads(List<Thread> threads) {
        this.threads = threads;
    }

    public static Finder<String, Forum> getFinder() {
        return finder;
    }

    public static void setFinder(Finder<String, Forum> finder) {
        Forum.finder = finder;
    }
}
