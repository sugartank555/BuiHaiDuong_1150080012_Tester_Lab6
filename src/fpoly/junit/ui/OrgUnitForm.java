package fpoly.junit.ui;

import fpoly.junit.model.OrganizationUnit;
import fpoly.junit.service.OrgUnitService;
import javax.swing.*;

public class OrgUnitForm extends JFrame {

    JTextField txtId = new JTextField();
    JTextField txtName = new JTextField();
    JTextArea txtDesc = new JTextArea();
    JButton btnSave = new JButton("Save");

    OrgUnitService service = new OrgUnitService();

    public OrgUnitForm() {
        setTitle("Add Organization Unit");
        setSize(400, 300);
        setLayout(null);

        add(new JLabel("Unit ID")).setBounds(30, 20, 100, 25);
        txtId.setBounds(150, 20, 200, 25);
        add(txtId);

        add(new JLabel("Name")).setBounds(30, 60, 100, 25);
        txtName.setBounds(150, 60, 200, 25);
        add(txtName);

        add(new JLabel("Description")).setBounds(30, 100, 100, 25);
        txtDesc.setBounds(150, 100, 200, 60);
        add(txtDesc);

        btnSave.setBounds(150, 180, 80, 30);
        add(btnSave);

        btnSave.addActionListener(e -> save());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void save() {
        OrganizationUnit unit = new OrganizationUnit(
                txtId.getText(),
                txtName.getText(),
                txtDesc.getText()
        );
        service.save(unit);
        JOptionPane.showMessageDialog(this, "Saved!");
    }

    public static void main(String[] args) {
        new OrgUnitForm();
    }
}
