import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPanelWindow extends JFrame {
    private JButton addBookButton, removeBookButton, listBooksButton, listMembersButton, logoutButton;

    public AdminPanelWindow() {
        setTitle("Admin Panel");
        setSize(400,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,1,10,10));
        setLocationRelativeTo(null);

        addBookButton = new JButton("Add Book");
        removeBookButton = new JButton("Remove Book");
        listBooksButton = new JButton("List Books");
        listMembersButton = new JButton("Member List");
        logoutButton = new JButton("Logout");

        addBookButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new AddBookWindow().setVisible(true);
            }
        });

        removeBookButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String bookId = JOptionPane.showInputDialog("Enter Book ID to remove:");
                LibraryApp.bookManager.removeBook(bookId);
            }
        });

        listBooksButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                LibraryApp.bookManager.listBooks();
            }
        });

        listMembersButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                LibraryApp.memberManager.listMembers();
            }
        });

        logoutButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new MainWindow().setVisible(true);
                dispose();
            }
        });

        add(addBookButton);
        add(removeBookButton);
        add(listBooksButton);
        add(listMembersButton);
        add(logoutButton);
    }
}
