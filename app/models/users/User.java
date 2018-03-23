package models.users;

import io.ebean.Finder;
import io.ebean.Model;
import io.ebean.annotation.NotNull;
import org.mindrot.jbcrypt.BCrypt;

import javax.persistence.*;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "privileges")
public class User extends Model{

    @Id
    private String id;

    @Column(unique = true)
    @NotNull
    private String email;

    @NotNull
    private String password;
    private String firstName;
    private String lastName;

    @NotNull
    private String username;
    private Date joined;

    private static Finder<String, User> finder = new Finder<>(User.class);

    public User(String id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    public User(String id, String email, String password, String firstName, String lastName, String username, Date joined) {
        this(id, email, password);
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.joined = joined;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
        this.password = BCrypt.hashpw(password, BCrypt.gensalt());
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

    @Override
    public void save() {
        password = BCrypt.hashpw(password, BCrypt.gensalt());
        super.save();
    }

    public static User get(String id) {
        return finder.ref(id);
    }

    public static User getWithEmail(String email) {
        return finder.query().where().eq("email", email).findUnique();
    }

    public static boolean exists(String email) {
        return finder.query().where().eq("email", email).findCount() == 1;
    }

    private static boolean checkPassword(String plain, String hash) {
        return BCrypt.checkpw(plain, hash);
    }

    public static boolean auth(String email, String password) {
        return exists(email) && checkPassword(get(email).password, password);
    }



}
