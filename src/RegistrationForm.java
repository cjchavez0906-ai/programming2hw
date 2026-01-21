import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {

    public RegistrationForm() {
        setTitle("Registration Form");
        setSize(400, 230);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel emailLabel = new JLabel("Email:");
        JLabel passwordLabel = new JLabel("Password:");

        JTextField usernameField = new JTextField();
        JTextField emailField = new JTextField();
        JPasswordField passwordField = new JPasswordField();

        JButton registerButton = new JButton("Register");
        registerButton.setEnabled(false);

        KeyAdapter keyAdapter = new KeyAdapter() {
            public void keyReleased(KeyEvent e) {
                registerButton.setEnabled(
                        !usernameField.getText().isEmpty() &&
                                !emailField.getText().isEmpty() &&
                                passwordField.getPassword().length > 0
                );
            }
        };

        usernameField.addKeyListener(keyAdapter);
        emailField.addKeyListener(keyAdapter);
        passwordField.addKeyListener(keyAdapter);

        registerButton.addActionListener(e -> {

            int choice = JOptionPane.showConfirmDialog(
                    RegistrationForm.this,
                    "Do you want to register?",
                    "Confirm",
                    JOptionPane.YES_NO_OPTION
            );

            if (choice != JOptionPane.YES_OPTION) {
                return;
            }

            String username = usernameField.getText();
            String email = emailField.getText();
            String password = new String(passwordField.getPassword());

            if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(
                        RegistrationForm.this,
                        "Please fill in all fields",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            if (!email.contains("@")) {
                JOptionPane.showMessageDialog(
                        RegistrationForm.this,
                        "Invalid email address",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );
                return;
            }

            System.out.println("Username: " + username);
            System.out.println("Email: " + email);
            System.out.println("Password: " + password);

            JOptionPane.showMessageDialog(
                    RegistrationForm.this,
                    "Registered Successfully!\nUsername: " + username + "\nEmail: " + email
            );

            usernameField.setText("");
            emailField.setText("");
            passwordField.setText("");
            registerButton.setEnabled(false);
        });

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(emailLabel);
        panel.add(emailField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(new JLabel());
        panel.add(registerButton);

        add(panel);
    }
}