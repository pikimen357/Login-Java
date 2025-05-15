import javax.swing.*;
import java.awt.*;

public class LoginPage extends JFrame {
    public LoginPage() {
        setTitle("Sistem Informasi Akademis");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setResizable(false);

//        bikin panel dengan title login
        JPanel panel = new JPanel(new BorderLayout());

        add(panel);

        JLabel label = new JLabel("Please Login", JLabel.CENTER);
        label.setFont(new Font("Tahoma", Font.BOLD, 19));
        panel.add(label, BorderLayout.NORTH);

        JButton button = new JButton("Login");
        panel.add(button, BorderLayout.SOUTH);

//        bikin field
        JPanel fieldPanel = new JPanel(new GridLayout(2, 2));

//        bikin field username
        fieldPanel.add(new JLabel("Username:"));
        JTextField usernameField = new JTextField();
        fieldPanel.add(usernameField);

//        bikin field password
        fieldPanel.add(new JLabel("Password:"));
        JPasswordField passwordField = new JPasswordField();
        fieldPanel.add(passwordField);

        panel.add(fieldPanel);

        button.addActionListener(e -> {
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            if (username.equals("Admin") && password.equals("admin123")) {
                JOptionPane.showMessageDialog(this, "GREAT!! Login Successful");
                dispose();
                new Dashboard().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Wrong Username or Password");
                usernameField.setText("");
                passwordField.setText("");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(
                () -> new LoginPage().setVisible(true)
        );
    }
}
