package models.users;

import models.Post;
import models.Game;
import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.NotNull;
import models.Cart;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import static models.Post.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "privileges")
@SequenceGenerator(name = "id_gen", initialValue = 12432, sequenceName = "user_seq")
public class User extends Model{

    @Id
    @GeneratedValue(generator = "id_gen", strategy = GenerationType.SEQUENCE)
    private Integer id;

    @Column(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;
    private String firstName;
    private String lastName;
    private String bio;

    @NotNull
    private String username;
    private Date joined;

    @ManyToMany
    private List<Game> gamesList;

    @OneToOne
    private Cart cart;

    private boolean suspended;

    private Date suspendedUntil;

    private static Finder<Integer, User> finder = new Finder<>(User.class);

    public User(Integer id, String email, String password, String firstName, String lastName, String username,
                Date joined, Cart cart, List<Game> gamesList) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.joined = joined;
        this.cart = cart;
        this.gamesList = gamesList;
    }

    public Integer getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public Cart getCart() {
        return cart;
    }

    public void setGamesList(List<Game> gamesList) {
        this.gamesList = gamesList;
    }

    public List<Game> getGamesList() {
        return gamesList;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Date getSuspendedUntil() {
        return suspendedUntil;
    }

    public String suspendedUntilDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(suspendedUntil);
    }

    public boolean getSuspended() {
        return suspended;
    }

    public void suspend(Date date) {
        suspended = true;
        this.suspendedUntil = date;
    }

    public void unlock() {
        suspended = false;
        suspendedUntil = null;
    }

    public static Finder<Integer, User> getFinder() {
        return finder;
    }

    @Override
    public void save() {
        password = BCrypt.hashpw(password, BCrypt.gensalt());
        super.save();
    }

    @Override
    public void update() {
        if (!BCrypt.checkpw(password, getWithEmail(email).password)) {
            password = BCrypt.hashpw(password, BCrypt.gensalt());
        }
        super.update();
    }

    public static User get(int id) {
        return finder.ref(id);
    }

    public static User getWithEmail(String email) {
        if (email == null) {
            return null;
        }
        return finder.query().where().eq("email", email).findOne();
    }

   public static boolean exists(String email) {
        return finder.query().where().eq("email", email).findUnique() != null;
    }

    public static boolean auth(String email, String password) {
        return exists(email) && BCrypt.checkpw(password, getWithEmail(email).password);
    }

    public List<Post> getPosts() {
        return Post.getPostsByUser(this.id);
    }
}