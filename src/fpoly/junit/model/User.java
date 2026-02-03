package fpoly.junit.model;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        if (username.isEmpty())
            throw new IllegalArgumentException("Username required");
        if (password.length() < 6)
            throw new IllegalArgumentException("Password too short");

        this.username = username;
        this.password = password;
    }
}
