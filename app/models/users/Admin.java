package models.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User{
    /**
     * Create a administrator.
     * @param id Primary key.
     * @param email Unique. administrator will use email to login.
     * @param password Hashed. administrator will user password with email.
     * @param firstName administrator's first name.
     * @param lastName administrator's last name.
     * @param username The username that everyone will see.
     * @param joined The date when the account has been registered.
     */
    public Admin(String id, String email, String password, String firstName, String lastName, String username, Date joined) {
        super(id, email, password, firstName, lastName, username, joined);
    }

    /**
     * Get a unique administrator.
     * @param id The id that the administrator holds.
     * @return The administrator with that unique id.
     */
    public static Admin get(String id) {
        return (Admin) getFinder().ref(id);
    }
}
