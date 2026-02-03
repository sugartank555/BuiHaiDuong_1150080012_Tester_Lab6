package fpoly.junit.ui;

import javax.swing.*;

public class UserForm extends JFrame {

    JTextField txtUser = new JTextField();
    JPasswordField txtPass = new JPasswordField();

    public UserForm() {
        setTitle("User Management");
        setSize(350, 220);
        setLayout(null);

        JLabel lblUser = new JLabel("Username:");
        lblUser.setBounds(30, 30, 100, 25);
        add(lblUser);

        txtUser.setBounds(140, 30, 160, 25);
        add(txtUser);

        JLabel lblPass = new JLabel("Password:");
        lblPass.setBounds(30, 70, 100, 25);
        add(lblPass);

        txtPass.setBounds(140, 70, 160, 25);
        add(txtPass);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(140, 120, 80, 30);
        add(btnSave);

        btnSave.addActionListener(e -> validateForm());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void validateForm() {
        if (txtUser.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Username is required");
            return;
        }
        if (txtPass.getPassword().length < 6) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters");
            return;
        }
        JOptionPane.showMessageDialog(this, "Valid data (UI only)");
    }

    public static void main(String[] args) {
        new UserForm();
    }
}
