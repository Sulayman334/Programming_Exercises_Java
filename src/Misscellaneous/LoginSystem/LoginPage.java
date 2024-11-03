package Misscellaneous.LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("UserID:");
    JLabel userPasswordLabel = new JLabel("Password:");
    JLabel message = new JLabel();


    HashMap<String,String> loginInfo = new HashMap<String,String>();

    public LoginPage(HashMap<String,String> loginInfoOriginal){

        userIdLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);
        message.setBounds(125,250,250,35);
        message.setFont(new Font(null, Font.ITALIC,25));


        usernameField.setBounds(125,100,200,25);
        passwordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.addActionListener(this);

        resetButton.setBounds(225,200,100,25);
       resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(message);
        frame.add(usernameField);
        frame.add(passwordField);
        frame.add(loginButton);
        frame.add(resetButton);

        this.loginInfo = loginInfoOriginal;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton){
            usernameField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == loginButton){


            String userId = usernameField.getText();
            String password =  String.valueOf(passwordField.getText());

            if (loginInfo.containsKey(userId)){
                if (loginInfo.get(userId).equals(password)){
                    message.setForeground(Color.GREEN);
                    message.setText("Login successful");
                    frame.dispose();
                    WelcomePage welcomePage = new WelcomePage(userId);
                } else {
                    message.setForeground(Color.RED);
                    message.setText("Login failed");
                }
            }
            else {
                message.setForeground(Color.RED);
                message.setText("UserID not found");
            }
        }
    }
}
