    import java.awt.*;
    import javax.swing.*;

            public class RegistrationForm extends JFrame {


                public RegistrationForm() {
                    setTitle("Registration Form");
                    setSize(350, 200);
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    setLocationRelativeTo(null);
                    JPanel panel;
                    {

                        panel = new JPanel(new GridLayout(3, 2, 10, 10));
                        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

                        JLabel usernameLabel = new JLabel("Username:");
                        JLabel emailLabel = new JLabel("Email:");
                        JTextField usernameField = new JTextField();
                        JTextField emailField = new JTextField();

                        JButton registerButton = new JButton("Register");

                        panel.add(usernameLabel);
                        panel.add(usernameField);
                        panel.add(emailLabel);
                        panel.add(emailField);
                        panel.add(new JLabel());
                        panel.add(registerButton);

                        registerButton.addActionListener(e -> {



                        String username = usernameField.getText();
                        String email = emailField.getText();
                        JOptionPane.showMessageDialog(RegistrationForm.this,
                                "Registered Successfully!\nUsername: " + username + "\nEmail: " + email
                        );
                    });
                    }
                    add(panel);

                }
                }
