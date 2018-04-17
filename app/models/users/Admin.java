package models.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

import models.Cart;
import models.Game;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User {

    /**
     * Create a public administrator.
     * @param id Primary key.
     * @param email Unique. administrator will use email to login.
     * @param password Hashed. administrator will user password with email.
     * @param firstName administrator's first name.
     * @param lastName administrator's last name.
     * @param username The username that everyone will see.
     * @param joined The date when the account has been registered.
     */
    public Admin(int id, String email, String password, String firstName, String lastName, String username,
                 Date joined, Cart cart, List<Game> gameList) {
        super(id, email, password, firstName, lastName, username, joined, cart, gameList);
    }
}
