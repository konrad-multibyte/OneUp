package controllers;

import models.users.Admin;
import models.users.Customer;
import models.users.User;
import play.mvc.Action;
import play.mvc.Http;
import play.mvc.Result;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class Auth {

    static class Administrator extends Action.Simple {
        @Override
        public CompletionStage<Result> call(Http.Context context) {
            User user = User.getWithEmail(context.session().get("email"));
            if (user == null) {
                return CompletableFuture.completedFuture(forbidden());
            }
            if (user.getClass().equals(Admin.class)) {
                return delegate.call(context);

            }
            return CompletableFuture.completedFuture(badRequest());
        }
    }

    static class Normal extends Action.Simple {

        @Override
        public CompletionStage<Result> call(Http.Context context) {
            User user = User.getWithEmail(context.session().get("email"));
            if (user == null) {
                return CompletableFuture.completedFuture(forbidden());
            }
            if (user.getClass().equals(Customer.class)) {
                return delegate.call(context);
            }
            return CompletableFuture.completedFuture(badRequest());
        }
    }
}
