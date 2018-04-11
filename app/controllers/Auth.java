package controllers;

import models.users.Customer;
import models.users.Admin;
import models.users.User;
import play.mvc.*;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.CompletableFuture;

class Auth {

    static class AuthAdmin extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            if (email != null) {
                User user = User.getWithEmail(email);
                if (user.getClass().equals(Admin.class)) {
                    return delegate.call(ctx);
                } else return CompletableFuture.completedFuture(forbidden("HTTP 403: Forbidden"));
            }
            return CompletableFuture.completedFuture(badRequest("HTTP 400: Bad Request"));
        }
    }
    
    static class AuthCustomer extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context ctx) {
            String email = ctx.session().get("email");
            if (email != null) {
                User user = User.getWithEmail(email);
                if (user.getClass().equals(Customer.class)) {
                    return delegate.call(ctx);
                } else return CompletableFuture.completedFuture(forbidden("HTTP 403: Forbidden"));
            }
            return CompletableFuture.completedFuture(badRequest("HTTP 400: Bad Request"));
        }
    }
}