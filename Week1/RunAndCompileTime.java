package Week1;

public class RunAndCompileTime {
}

class Car {
    int speed;

    void run() {
        System.out.println("turned on using key");
    }

    void display() {
        System.out.println("speed " + speed);
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

}

class Tesla extends Car {

    void run() {
        System.out.println("turned on using mobile");
    }

    void display(int x) {
        int time = x / speed;
        System.out.println("time " + time);
    }

    public static void main(String args[]) {
        Car a = new Car();
        Car b = new Tesla();
        Tesla c = new Tesla();
        a.setSpeed(100);
        b.setSpeed(100);
        c.setSpeed(100);
        b.run(); // rumtime
        a.display();
        c.display(500); // compiletime

    }
}
