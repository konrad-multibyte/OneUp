package models.users;

/**
 * Placeholder user. Only used for authentication.
 */
@Deprecated
public class Login {

    private String email, password;

    /**
     * Default constructor.
     */
    public Login() {}

    /**
     * Creates login object used for authentication.
     * @param email Email filled in the form.
     * @param password Plaintext password filled in the form.
     */
    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Gets the email provided by the user.
     * @return Email.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Gets the password provided by the user.
     * @return Plaintext password.
     */
    public String getPassword() {
        return password;
    }
}
