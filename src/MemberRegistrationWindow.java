import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemberRegistrationWindow extends JFrame {
    private JTextField idField, nameField;
    private JPasswordField passwordField;
    private JButton registerButton, backButton;

    public MemberRegistrationWindow() {
        setTitle("Member Registration");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,2,10,10));
        setLocationRelativeTo(null);

        add(new JLabel("Member ID: "));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name: "));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Password: "));
        passwordField = new JPasswordField();
        add(passwordField);

        registerButton = new JButton("Register");
        backButton = new JButton("Back");
        add(registerButton);
        add(backButton);

        registerButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String id = idField.getText();
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());
                LibraryApp.memberManager.registerMember(id, name, password);
                new MainWindow().setVisible(true);
                dispose();
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