package models.users;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@DiscriminatorValue("admin")
public class Admin extends User{

    public Admin() {
    }

    public Admin(String id, String email, String password, String firstName, String lastName, String username, Date joined) {
        super(id, email, password, firstName, lastName, username, joined);
    }

    public static Admin get(String id) {
        return (Admin) getFinder().ref(id);
    }
}
