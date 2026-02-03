package fpoly.junit.test;

import fpoly.junit.model.User;
import org.junit.Test;

public class UserTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyUsername() {
        new User("", "123456");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testShortPassword() {
        new User("admin", "123");
    }

    @Test
    public void testValidUser() {
        new User("admin", "123456");
    }
}
