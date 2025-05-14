public class Member {
    private String id;
    private String name;
    private String password;

    public Member(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getPassword() { return password; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}