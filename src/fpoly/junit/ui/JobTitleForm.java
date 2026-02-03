package fpoly.junit.ui;

import javax.swing.*;

public class JobTitleForm extends JFrame {

    JTextField txtTitle = new JTextField();
    JTextArea txtDesc = new JTextArea();

    public JobTitleForm() {
        setTitle("Add Job Title");
        setSize(400, 260);
        setLayout(null);

        JLabel lblTitle = new JLabel("Job Title:");
        lblTitle.setBounds(30, 30, 100, 25);
        add(lblTitle);

        txtTitle.setBounds(150, 30, 200, 25);
        add(txtTitle);

        JLabel lblDesc = new JLabel("Description:");
        lblDesc.setBounds(30, 70, 100, 25);
        add(lblDesc);

        txtDesc.setBounds(150, 70, 200, 80);
        add(txtDesc);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(150, 170, 80, 30);
        add(btnSave);

        btnSave.addActionListener(e -> validateForm());

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void validateForm() {
        if (txtTitle.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Job Title cannot be empty");
            return;
        }
        if (txtTitle.getText().length() > 100) {
            JOptionPane.showMessageDialog(this, "Job Title max 100 characters");
            return;
        }
        if (txtDesc.getText().length() > 400) {
            JOptionPane.showMessageDialog(this, "Description max 400 characters");
            return;
        }
        JOptionPane.showMessageDialog(this, "Valid data (UI only)");
    }

    public static void main(String[] args) {
        new JobTitleForm();
    }
}
