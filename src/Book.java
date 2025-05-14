public class Book {
    private String id;
    private String name;
    private String author;
    private int quantity;

    public Book(String id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getAuthor() { return author; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Author: " + author + ", Quantity: " + quantity;
    }
}
