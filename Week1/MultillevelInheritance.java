package Week1;

class l1 {
    void level1() {
        System.out.println("l1");
    }
}

class l2 extends l1 {
    void level2() {
        System.out.println("l2");
    }
}

class l3 extends l2 {
    void level3() {
        System.out.println("l3");
    }
}

public class MultillevelInheritance {

    public static void main(String args[]) {
        l3 l3 = new l3();
        l3.level1();
        l3.level2();
        l3.level3();
    }
}