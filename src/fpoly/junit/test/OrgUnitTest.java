package fpoly.junit.test;

import fpoly.junit.model.OrganizationUnit;
import fpoly.junit.service.OrgUnitService;
import org.junit.Test;

public class OrgUnitTest {

    OrgUnitService service = new OrgUnitService();

    @Test(expected = IllegalArgumentException.class)
    public void testEmptyId() {
        service.save(new OrganizationUnit("", "HR", "Human Resource"));
    }
}
