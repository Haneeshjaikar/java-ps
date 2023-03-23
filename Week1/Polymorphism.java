// Implementing both Inheritance and Polymorphism

package Week1;

public class Polymorphism {
    public static void main(String[] args) {
        User user = new User(1, "user");
        User admin = new AdminUser(2, "admin");
        System.out.println(user.getId() + " " + user.getName());
        System.out.println(admin.getId() + " " + admin.getName());
        user.access();
        admin.access();
    }

}

class User {

    private int id;
    public String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void access() {
        System.out.println("I'm a normal user.");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    };
}

class AdminUser extends User {

    public AdminUser(int id, String name) {
        super(id, name);
    }

    @Override
    public void access() {
        System.out.println("I'm an admin user.");
    };
}