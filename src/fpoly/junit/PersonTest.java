package fpoly.junit;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class PersonTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void testExpectedException3() {
        try {
            new Person("Fpoly", -1);
        } catch (IllegalArgumentException e) {
            // PASS
        }
    }


}
