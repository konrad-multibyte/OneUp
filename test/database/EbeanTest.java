package database;

import io.ebean.Ebean;
import models.users.Customer;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import java.util.UUID;

import static org.junit.Assert.assertEquals;

public class EbeanTest extends WithDatabase {

    @BeforeClass
    public static void setup() {
        WithDatabase.setup();
    }

    @Test
    public void test() {
        Customer user = new Customer(UUID.randomUUID().toString(), "EbeanTest@1up.com", "deleteMeIfUFindMe");
        user.save();

        int rows = Ebean.find(Customer.class).findCount();
        assertEquals(1, rows);

        user.delete();

        rows = Ebean.find(Customer.class).findCount();
        assertEquals(0 ,rows);
    }

    @AfterClass
    public static void teardown() {
        WithDatabase.teardown();
    }
}
