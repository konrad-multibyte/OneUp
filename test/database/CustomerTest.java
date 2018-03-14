package database;

import models.Game;
import models.users.Customer;
import org.junit.Test;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Transactional
public class CustomerTest {


    @Test
    public void create() {
        List<Game> games = new ArrayList<>();
        List<Game.GameTags>
        games.add()
        Customer customer = new Customer("1", "admin@1upgames.com", "password", "Aaron", "Lloyd", "AaronBoss", new Date(), games);
    }

    @Test
    public void read() {

    }

    @Test
    public void update() {

    }

    @Test
    public void delete() {

    }
}
