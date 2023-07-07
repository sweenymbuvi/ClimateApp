package Com.Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn extends JFrame implements ActionListener {
    private JTextField idNumberField;
    private JPasswordField passwordField;
    private JButton signInButton;

    public SignIn() {
        setTitle("Sign In");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2, 10, 10));

        JLabel idNumberLabel = new JLabel("ID Number:");
        panel.add(idNumberLabel);

        idNumberField = new JTextField();
        panel.add(idNumberField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        signInButton = new JButton("Sign In");
        signInButton.addActionListener(this);
        panel.add(signInButton);

        panel.setBounds(50, 50, 300, 100);
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signInButton) {
            String idNumber = idNumberField.getText();
            String password = new String(passwordField.getPassword());

            // Add your sign-in logic here

            // Display a message dialog based on the sign-in result
            if (idNumber.equals("admin") && password.equals("password")) {
                JOptionPane.showMessageDialog(this, "Sign in successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Sign in failed. Invalid ID number or password.");
            }

            // Clear the input fields
            idNumberField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SignIn signInPage = new SignIn();
    }
}


