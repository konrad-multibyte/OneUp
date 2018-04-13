package database;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import play.Application;
import play.test.WithApplication;

import static play.test.Helpers.*;

public class WithDatabase extends WithApplication {

    private static Application application;

    @BeforeClass
    public static void setup() {
        application = fakeApplication(inMemoryDatabase());
    }

    @AfterClass
    public static void teardown() {
        stop(application);
    }
}
