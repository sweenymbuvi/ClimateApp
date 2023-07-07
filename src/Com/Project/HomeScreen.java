package Com.Project;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomeScreen extends JFrame {
    private JLabel appNameLabel;
    private JButton signUpButton;
    private JButton signInButton;

    public HomeScreen() {
        // Set up the JFrame
        setTitle("Climate Monitor App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        setLayout(null);

        // Create the app name label
        appNameLabel = new JLabel("Climate Monitor App");
        appNameLabel.setBounds(100, 30, 200, 30);
        add(appNameLabel);

        // Create the sign up button
        signUpButton = new JButton("Sign Up");
        signUpButton.setBounds(100, 80, 100, 30);
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle sign up button click event
                // Add your sign up logic here
                System.out.println("Sign up button clicked");
            }
        });
        add(signUpButton);

        // Create the sign in button
        signInButton = new JButton("Sign In");
        signInButton.setBounds(100, 200, 100, 30);
        signInButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Handle sign in button click event
                // Add your sign in logic here
                System.out.println("Sign in button clicked");
            }
        });
        add(signInButton);

        // Make the JFrame visible

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the HomeScreen class
        HomeScreen homeScreen = new HomeScreen();
    }
}



