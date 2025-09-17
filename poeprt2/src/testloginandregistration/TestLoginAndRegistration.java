package testloginandregistration;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TestLoginAndRegistration {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField contactField;

    public TestLoginAndRegistration() {
        createGUI();
    }

    private void createGUI() {
        frame = new JFrame("Login & Registration Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridBagLayout());
        frame.setSize(400, 300);

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);

        // Username
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_END;
        frame.add(new JLabel("Username:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        usernameField = new JTextField(10);
        frame.add(usernameField, gbc);

        // Password
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.LINE_END;
        frame.add(new JLabel("Password:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        passwordField = new JPasswordField(10);
        frame.add(passwordField, gbc);

        // Contact Number
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.LINE_END;
        frame.add(new JLabel("Contact Number:"), gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.LINE_START;
        contactField = new JTextField(10);
        frame.add(contactField, gbc);

        // Login Button
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton loginButton = new JButton("Login");
        loginButton.addActionListener((ActionEvent e) -> {
            login();
        });
        frame.add(loginButton, gbc);

        // Register Button
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.CENTER;
        JButton registerButton = new JButton("Register");
        registerButton.addActionListener((ActionEvent e) -> {
            register();
        });
        frame.add(registerButton, gbc);

        frame.pack();
        frame.setVisible(true);
    }

    private void login() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String contact = contactField.getText();

        if (username.equals("admin") && password.equals("password") && contact.equals("12345")) {
            JOptionPane.showMessageDialog(frame, "Login successful!");
        } else {
            JOptionPane.showMessageDialog(frame, "Invalid login details");
        }
    }

    private void register() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String contact = contactField.getText();

        JOptionPane.showMessageDialog(frame,
                "Registered Successfully!\n\nUsername: " + username +
                        "\nPassword: " + password +
                        "\nContact: " + contact);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(TestLoginAndRegistration::new);
    }
}