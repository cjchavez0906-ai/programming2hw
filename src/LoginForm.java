import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginForm extends JFrame {
    public LoginForm(String username, String emailaddress) {
        setTitle("Login Form");
        setSize(350, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel lblUsername = new JLabel("Username:");
        JTextField txtUsername = new JTextField(15);
        JLabel lblemailaddress = new JLabel("Email Address:");
        JTextField txtemail = new JTextField(15);

        JButton btnRegister = new JButton("Login");

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblUsername, gbc);


        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txtUsername, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        add(lblemailaddress, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.WEST;
        add(txtemail, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        add(btnRegister, gbc);

        btnRegister.addActionListener(e -> {
            String usernameInput = txtUsername.getText();
            String emailaddressInput = txtemail.getText();
            if(usernameInput.equals(username) && emailaddressInput.equals(emailaddress)) {
                JOptionPane.showMessageDialog(null, "Log In Successful. " +
                        "" + username + " "
                        + emailaddress);
            }  else {
                JOptionPane.showMessageDialog(null, "Invalid Username or Email Address");

            }
            JOptionPane.showMessageDialog(null,
                    "Welcome " + username + " " + emailaddress);
        });



    }
}

