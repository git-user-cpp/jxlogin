import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;;

public class LoginPage implements ActionListener {
    JFrame frame = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton resetButton = new JButton("Reset");
    JTextField userIdField = new JTextField();
    JPasswordField userPasswordField = new JPasswordField();
    JLabel userIdLabel = new JLabel("User ID");
    JLabel userPasswordLabel = new JLabel("Password");
    JLabel messagLabel = new JLabel("This is a test");

    HashMap<String, String> loginInfo = new HashMap<>();

    LoginPage(HashMap<String, String> logInfoOriginal) {
        loginInfo = logInfoOriginal;

        userIdLabel.setBounds(50, 100, 75, 25);
        userPasswordLabel.setBounds(50, 150, 75, 25);

        messagLabel.setBounds(125, 250, 250, 35);
        messagLabel.setFont(new Font(null, Font.ITALIC, 20));

        userIdField.setBounds(125, 100, 200, 25);
        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);

        frame.add(userIdLabel);
        frame.add(userPasswordLabel);
        frame.add(userIdField);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 420);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resetButton) {
            userIdField.setText("");
            userPasswordField.setText("");
        }

        if(e.getSource() == loginButton) {
            String userId = userIdField.getText();
            String passwd = String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userId) && (loginInfo.get(userId).equals(passwd))) {
                messagLabel.setForeground(Color.green);
                messagLabel.setText("Login successful");

                frame.dispose();
                new WelcomePage(userId);
            } else {
                messagLabel.setForeground(Color.red);
                messagLabel.setText("Wrong login or password");
            }
        }
    } 
}
