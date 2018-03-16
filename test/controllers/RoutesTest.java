package controllers;

import org.junit.Test;
import play.Application;
import play.inject.guice.GuiceApplicationBuilder;
import play.mvc.Http;
import play.test.WithApplication;

import static org.junit.Assert.assertEquals;
import static play.mvc.Http.Status.OK;
import static play.test.Helpers.GET;
import static play.test.Helpers.route;

public class RoutesTest extends WithApplication {

    @Override
    protected Application provideApplication() {
        return new GuiceApplicationBuilder().build();
    }

    @Test
    public void register() {
        assertEquals(OK, route(app, get("/register")).status());
    }

    @Test
    public void login() {
        assertEquals(OK, route(app, get("/login")).status());
    }

    private Http.RequestBuilder get(String route) {
        return new Http.RequestBuilder().method(GET).uri(route);
    }
}
