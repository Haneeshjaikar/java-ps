package Week1;

public class EnumConstructor {
    public static void main(String args[]) {
        Access[] access = Access.values();
        for (Access a : access) {
            System.out.println("name : " + a.getName() + " rank: " + a.getRank());
        }
    }
}

enum Access {
    ADMIN(2, "admin"), SUPERADMIN(1, "superadmin"), USER(3, "user");

    private int rank;
    private String name;

    Access(int rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }
}
