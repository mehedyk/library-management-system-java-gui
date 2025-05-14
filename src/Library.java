
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book getBookById(String bookId) {
        for (Book book : books) {
            if(book.getId().equals(bookId))
                return book;
        }
        return null;
    }
}
