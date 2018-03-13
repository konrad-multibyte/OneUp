package models.users;

import models.Game;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@DiscriminatorValue("customer")
public class Customer extends User{

    private List<Game> gamesList;

    public Customer() {
    }

    public Customer(String id, String email, String password, String firstName, String lastName, String username, Date joined, List<Game> gamesList) {
        super(id, email, password, firstName, lastName, username, joined);
        this.gamesList = gamesList;
    }

    public List<Game> getGamesList() {
        return gamesList;
    }

    public void setGamesList(List<Game> gamesList) {
        this.gamesList = gamesList;
    }

    public static Customer get(String id) {
        return (Customer) getFinder().ref(id);
    }
}