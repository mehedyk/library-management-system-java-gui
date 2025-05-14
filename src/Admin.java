public class Admin {
    private String id;
    private String role;

    public Admin(String id, String role) {
        this.id = id;
        this.role = role;
    }

    public String getId() { return id; }
    public String getRole() { return role; }
}