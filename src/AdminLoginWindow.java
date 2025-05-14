import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminLoginWindow extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton, backButton;

    public AdminLoginWindow() {
        setTitle("Admin Login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2, 10,10));
        setLocationRelativeTo(null);

        add(new JLabel("Username: "));
        usernameField = new JTextField();
        add(usernameField);

        add(new JLabel("Password: "));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        backButton = new JButton("Back");
        add(loginButton);
        add(backButton);

        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if(username.equals(LibraryApp.admin.getId()) && password.equals("1234")){
                    JOptionPane.showMessageDialog(null, "Admin logged in!");
                    new AdminPanelWindow().setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials!");
                }
            }
        });

        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainWindow().setVisible(true);
                dispose();
            }
        });
    }
}