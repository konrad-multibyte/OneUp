package models.users;

import models.Game;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import models.Cart;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

    /**
     * Create a customer
     * @param id Primary key.
     * @param email Unique. Customer will use email to login.
     * @param password Hashed. Customer will user password with email.
     * @param firstName Customer's first name.
     * @param lastName Customer's last name
     * @param username The username that everyone will see
     * @param joined The date when the account has been registered.
     * @param gamesList List of games that the customer owns.
     */
    public Customer(int id, String email, String password, String firstName, String lastName, String username,
                    Date joined, Cart cart, List<Game> gamesList) {
        super(id, email, password, firstName, lastName, username, joined, cart, gamesList);
    }
}