package models.users;

import models.Game;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User {

    @ManyToMany
    private List<Game> gamesList;


    public Customer(String id, String email, String password) {
        super(id, email, password);
    }

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
    public Customer(String id, String email, String password, String firstName, String lastName, String username, Date joined, List<Game> gamesList) {
        super(id, email, password, firstName, lastName, username, joined);
        this.gamesList = gamesList;
    }

    /**
     * Get the game list owned by the customer.
     * @return List of games
     */
    public List<Game> getGamesList() {
        return gamesList;
    }
}