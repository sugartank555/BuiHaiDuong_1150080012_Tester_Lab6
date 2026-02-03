package fpoly.junit.test;

import fpoly.junit.model.JobTitle;
import org.junit.Test;

public class JobTitleTest {

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyTitle() {
        new JobTitle("", "Desc");
    }

    @Test
    public void testValidTitle() {
        new JobTitle("Developer", "Good job");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLongDescription() {
        new JobTitle("Dev", "x".repeat(401));
    }
}
