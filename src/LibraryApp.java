public class LibraryApp {
    public static Library library;
    public static BookManager bookManager;
    public static MemberManager memberManager;
    public static Admin admin;

    static {
        library = new Library();
        bookManager = new BookManager(library);
        memberManager = new MemberManager();
        admin = new Admin("mehedy", "Admin");

        // Add some default books
        library.addBook(new Book("1", "The Catcher in the Rye", "J.D. Salinger", 5));
        library.addBook(new Book("2", "To Kill a Mockingbird", "Harper Lee", 3));
        library.addBook(new Book("3", "1984", "George Orwell", 4));
    }
}
