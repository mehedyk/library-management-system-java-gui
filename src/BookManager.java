import javax.swing.JOptionPane;

public class BookManager {
    private Library library;

    public BookManager(Library library) {
        this.library = library;
    }

    public void addBook(String id, String name, String author, int quantity) {
        library.addBook(new Book(id, name, author, quantity));
        JOptionPane.showMessageDialog(null, "Book added: " + name);
    }

    public void removeBook(String id) {
        library.removeBook(id);
        JOptionPane.showMessageDialog(null, "Book removed.");
    }

    public void listBooks() {
        StringBuilder sb = new StringBuilder();
        for(Book book : library.getBooks()){
            sb.append(book.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString(), "Book List", JOptionPane.INFORMATION_MESSAGE);
    }

    public boolean borrowBook(String bookId) {
        Book book = library.getBookById(bookId);
        if(book != null) {
            if(book.getQuantity() > 0) {
                book.setQuantity(book.getQuantity() - 1);
                JOptionPane.showMessageDialog(null, "Book borrowed: " + book.getName());
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Book out of stock.");
                return false;
            }
        }
        JOptionPane.showMessageDialog(null, "Book not found.");
        return false;
    }

    public boolean returnBook(String bookId) {
        Book book = library.getBookById(bookId);
        if(book != null) {
            book.setQuantity(book.getQuantity() + 1);
            JOptionPane.showMessageDialog(null, "Book returned: " + book.getName());
            return true;
        }
        JOptionPane.showMessageDialog(null, "Book not found.");
        return false;
    }
}
