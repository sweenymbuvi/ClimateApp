package Com.Project;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp extends JFrame implements ActionListener {
     JTextField firstNameField;
     JTextField lastNameField;
     JTextField idNumberField;
     JTextField contactField;
     JPasswordField passwordField;
     JComboBox<String> regionComboBox;
     JButton signUpButton,clearButton;

    public SignUp() {
        setTitle("SIGN UP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(8, 2, 20, 20));

        JLabel firstNameLabel = new JLabel("First Name:");
        panel.add(firstNameLabel);

        firstNameField = new JTextField();
        panel.add(firstNameField);

        JLabel lastNameLabel = new JLabel("Last Name:");
        panel.add(lastNameLabel);

        lastNameField = new JTextField();
        panel.add(lastNameField);

        JLabel idNumberLabel = new JLabel("ID Number:");
        panel.add(idNumberLabel);

        idNumberField = new JTextField();
        panel.add(idNumberField);

        JLabel contactLabel = new JLabel("Contact:");
        panel.add(contactLabel);

        contactField = new JTextField();
        panel.add(contactField);

        JLabel passwordLabel = new JLabel("Password:");
        panel.add(passwordLabel);

        passwordField = new JPasswordField();
        panel.add(passwordField);

        JLabel regionLabel = new JLabel("Region:");
        panel.add(regionLabel);

        String[] regions = {"Central/Eastern", "Western", "Coastal", "Northern"};  // Modify with your desired regions
        regionComboBox = new JComboBox<>(regions);
        panel.add(regionComboBox);

        signUpButton = new JButton("Sign Up");
        signUpButton.addActionListener(this);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstNameField.setText("");
                lastNameField.setText("");
                contactField.setText("");
                passwordField.setText("");
                idNumberField.setText("");
                regionComboBox.setSelectedIndex(0);
            }
        });

        JPanel buttonPanel = new JPanel(new FlowLayout());
        buttonPanel.add(signUpButton);
        buttonPanel.add(clearButton);

        panel.add(new JLabel());
        panel.add(buttonPanel);

        panel.setBounds(50, 50, 400, 400);
        add(panel);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == signUpButton) {
            String firstName = firstNameField.getText();
            String lastName = lastNameField.getText();
            String idNumber = idNumberField.getText();
            String email = contactField.getText();
            String password = new String(passwordField.getPassword());

            // Add your sign-up logic here

            // Display a message dialog with the user's information
            String message = "Sign up successful!\n"
                    + "First Name: " + firstName + "\n"
                    + "Last Name: " + lastName + "\n"
                    + "ID Number: " + idNumber + "\n"
                    + "Email: " + email + "\n"
                    + "Password: " + password;
            JOptionPane.showMessageDialog(this, message);

            // Clear the input fields
            firstNameField.setText("");
            lastNameField.setText("");
            contactField.setText("");
            passwordField.setText("");
        }
    }

    public static void main(String[] args) {
        SignUp signUpPage = new SignUp();
    }
}


