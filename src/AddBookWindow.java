import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddBookWindow extends JFrame {
    private JTextField idField, nameField, authorField, quantityField;
    private JButton addButton, backButton;

    public AddBookWindow() {
        setTitle("Add Book");
        setSize(300,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,2,10,10));
        setLocationRelativeTo(null);

        add(new JLabel("Book ID:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Author:"));
        authorField = new JTextField();
        add(authorField);

        add(new JLabel("Quantity:"));
        quantityField = new JTextField();
        add(quantityField);

        addButton = new JButton("Add");
        backButton = new JButton("Back");
        add(addButton);
        add(backButton);

        addButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String id = idField.getText();
                String name = nameField.getText();
                String author = authorField.getText();
                int quantity = Integer.parseInt(quantityField.getText());
                LibraryApp.bookManager.addBook(id, name, author, quantity);
                JOptionPane.showMessageDialog(null, "Book added successfully!");
                new AdminPanelWindow().setVisible(true);
                dispose();
            }
        });

        backButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                new AdminPanelWindow().setVisible(true);
                dispose();
            }
        });
    }
}
