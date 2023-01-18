import java.awt.*;
import java.awt.event.*;
import javax.swing.*;




public class LoginPage extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JButton loginButton;
    private JButton Back;

    public LoginPage() {
        setTitle/*we ca write here super also*/("Login Page");
        setLayout(new FlowLayout());

        usernameLabel = new JLabel("Username: ");
        add(usernameLabel);

        usernameField = new JTextField(20/*this is for a size defining */);
        add(usernameField);

        passwordLabel = new JLabel("Password: ");
        add(passwordLabel);

        passwordField = new JPasswordField(20);
        add(passwordField);

        loginButton = new JButton("Login");
        Back = new JButton("Back");
        add(loginButton);
        add(Back);

        Back.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Signup sgn = new Signup();
                setVisible(false);
                sgn.setVisible(true);
                dispose();
            }
        });
        // Back.addActionListener(event->{
        //     dispose(); // this is for close windows ...
        // });

        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)  {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword()); /// this is for create object 
                // check if the entered username and password are correct
                if(username.equals("admin") && password.equals("password")) {
                    JOptionPane.showMessageDialog(null, "Welcome " + username);
                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect username or password!");
                }
            }
        });
        setSize(350, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        LoginPage loginPage = new LoginPage();
        loginPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
