import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemberLoginWindow extends JFrame {
    private JTextField idField;
    private JPasswordField passwordField;
    private JButton loginButton, backButton;

    public MemberLoginWindow() {
        setTitle("Member Login");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3,2,10,10));
        setLocationRelativeTo(null);

        add(new JLabel("Member ID: "));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Password: "));
        passwordField = new JPasswordField();
        add(passwordField);

        loginButton = new JButton("Login");
        backButton = new JButton("Back");
        add(loginButton);
        add(backButton);

        loginButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String id = idField.getText();
                String password = new String(passwordField.getPassword());
                Member member = LibraryApp.memberManager.loginMember(id, password);
                if(member != null){
                    JOptionPane.showMessageDialog(null, "Member logged in!");
                    new MemberPanelWindow().setVisible(true);
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
