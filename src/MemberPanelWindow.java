import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MemberPanelWindow extends JFrame {
    private JButton listBooksButton, borrowBookButton, returnBookButton, logoutButton;

    public MemberPanelWindow() {
        setTitle("Member Panel");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1,10,10));
        setLocationRelativeTo(null);

        listBooksButton = new JButton("List Books");
        borrowBookButton = new JButton("Borrow a Book");
        returnBookButton = new JButton("Return a Book");
        logoutButton = new JButton("Logout");

        listBooksButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                LibraryApp.bookManager.listBooks();
            }
        });

        borrowBookButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String bookId = JOptionPane.showInputDialog("Enter Book ID to borrow:");
                LibraryApp.bookManager.borrowBook(bookId);
            }
        });

        returnBookButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String bookId = JOptionPane.showInputDialog("Enter Book ID to return:");
                LibraryApp.bookManager.returnBook(bookId);
            }
        });

        logoutButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainWindow().setVisible(true);
                dispose();
            }
        });

        add(listBooksButton);
        add(borrowBookButton);
        add(returnBookButton);
        add(logoutButton);
    }
}
