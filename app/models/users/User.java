package models.users;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "privileges")
public class User {

    public String email;
    public String firstName;
    public String lastName;
    public String username;
    public Date joined;

    public User() {
    }

    public User(String email, String firstName, String lastName, String username, Date joined) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.joined = joined;
    }
}
