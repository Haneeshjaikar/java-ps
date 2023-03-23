package Week1;

public class StringToEnum {
    enum Access {
        ADMIN, SUPERADMIN, USER


    }

    public static void main(String args[]) {
        String access = "AdMiN";
        Access en = null;
        for (Access access2 : Access.values()) {
            if (access2.name().equalsIgnoreCase(access)){
        en = Access.valueOf(access.toUpperCase());
        break;
     }
     
}
System.out.println(en);
}
}
