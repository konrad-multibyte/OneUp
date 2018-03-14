package database;

import models.users.Admin;
import org.junit.*;
import play.db.ebean.Transactional;

import java.util.Date;

@Transactional
public class AdminTest {

    @Test
    public void create() {
        Admin admin = new Admin("1", "admin@1upgames.com", "password", "Aaron", "Lloyd", "AaronBoss", new Date());
        admin.save();
        Assert.assertNotNull(Admin.get(admin.getId()));
        admin.delete();
    }

    @Test
    public void read() {
        Admin admin = new Admin("2", "admin2@1upgames.com", "password", "Matty", "Smith", "Matty1219", new Date());
        admin.save();
        Assert.assertEquals(admin, Admin.get(admin.getId()));
        admin.delete();
    }

    @Test
    public void update() {
        Admin admin = new Admin("3", "admin3@1upgames.com", "password", "Roger", "Noor", "Noorer", new Date());
        admin.save();
        admin.setLastName("Noore");
        admin.update();
        Assert.assertEquals(admin.getLastName(), Admin.get(admin.getId()).getFirstName());
        admin.delete();
    }

    @Test
    public void delete() {
        Admin admin = new Admin("4", "admin4@1upgames.com", "password", "Sara", "Byrne", "Noorer", new Date());
        admin.save();
        admin.delete();
        Assert.assertNull(Admin.get(admin.getId()));
    }
}
