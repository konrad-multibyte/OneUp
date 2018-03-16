package models.users;

import io.ebean.Model;
import javax.persistence.*;
import java.util.List;

@Entity
public class ForumThread extends Model {

    @Id
    private String id;

    @ManyToOne(cascade = CascadeType.ALL)
    private List<Posts> posts;

    public ForumThread(String id, List<Posts> posts) {
        this.id = id;
        this.posts = posts;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Posts> getPosts() {
        return posts;
    }

    public void setPosts(List<Posts> posts) {
        this.posts = posts;
    }
}
