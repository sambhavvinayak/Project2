/*
* making this for signUp page in java
*/


import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // this is for JFrame help to extends 

public class Signup extends JFrame{
    public JTextField usernameField;
    public JPasswordField passwordField;
    public JButton ButtonS;
    public JButton ButtonL;
    public JLabel heading;
    public JLabel username;
    public JLabel password;


    public  Signup(){

        super("SignUp Page"); // title 
        setLayout(new FlowLayout());  // it is compulsory becouse it set and align the all things


        usernameField = new JTextField(20);
        passwordField = new JPasswordField(20);
        ButtonS = new JButton("SignUp");
        ButtonL = new JButton("Login");
        username = new JLabel("UserName : ");
        password = new JLabel("Password : ");
        heading = new JLabel("Welcome in signing page .\nThat you cover it here only");
                
        add(heading);
        add(username);
        add(usernameField);
        add(password);
        add(passwordField);
        add(ButtonS);add(ButtonL);
        
        ButtonL.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent e){
                LoginPage login = new LoginPage();
                // setVisible(false);
                dispose();
                login.setVisible(true);
            }
        });

        ButtonS.addActionListener(new ActionListener(){

            public Boolean isEmpty(){
                Object pass = new String(passwordField.getPassword());
                Object user = usernameField.getText();
                return user.equals("")&&  pass.equals("");
                
            }
            // public void changed(){
            //     if (username.getText().equals("")) {
            //         Button.setEnabled(false);
            //     } else {
            //         Button.setEnabled(true);
            //     }
            // }
            public void actionPerformed(ActionEvent e){

                // String pass = new String(passwordField.getPassword());   // we can use this also as a time come we think about it then i can write here.
                // String user = usernameField.getText();

                if (/*user.equals("") && pass.equals("")*/isEmpty()) {
                    return;
                }else{
                    usernameField.setText("");
                    passwordField.setText("");
                    JOptionPane.showMessageDialog(null,"You SignUp Succesfully");
                    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                }
            }
        });
        
        setSize(400,300);
        setVisible(true);
    }
    public static void main(String[] args) {
        Signup signUp = new Signup();                                             
        signUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

