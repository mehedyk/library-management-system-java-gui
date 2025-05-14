import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainWindow extends JFrame {

    private JButton adminLoginButton, registerMemberButton, memberLoginButton, exitButton;

    public MainWindow() {
        setTitle("Library Management System");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));
        setLocationRelativeTo(null);

        adminLoginButton = new JButton("Login (Admin)");
        registerMemberButton = new JButton("Register (Member)");
        memberLoginButton = new JButton("Login (Member)");
        exitButton = new JButton("Exit");

        adminLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new AdminLoginWindow().setVisible(true);
                dispose();
            }
        });

        registerMemberButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemberRegistrationWindow().setVisible(true);
                dispose();
            }
        });

        memberLoginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new MemberLoginWindow().setVisible(true);
                dispose();
            }
        });

        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        add(adminLoginButton);
        add(registerMemberButton);
        add(memberLoginButton);
        add(exitButton);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new MainWindow().setVisible(true);
        });
    }
}