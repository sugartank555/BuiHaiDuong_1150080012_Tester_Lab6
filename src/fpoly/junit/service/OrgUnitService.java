package fpoly.junit.service;

import fpoly.junit.db.DBConnection;
import fpoly.junit.model.OrganizationUnit;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrgUnitService {

    public void save(OrganizationUnit unit) {
        if (unit.getUnitId().isEmpty())
            throw new IllegalArgumentException("Unit ID is required");
        if (unit.getName().isEmpty())
            throw new IllegalArgumentException("Name is required");

        try (Connection con = DBConnection.getConnection()) {
            String sql = "INSERT INTO organization_unit VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, unit.getUnitId());
            ps.setString(2, unit.getName());
            ps.setString(3, unit.getDescription());
            ps.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
