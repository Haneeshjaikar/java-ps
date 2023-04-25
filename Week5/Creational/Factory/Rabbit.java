package Week5.Creational.Factory;

public class Rabbit implements Animal {
    @Override
    public void eat() {
        System.out.println("Rabbit is eating");    
    }

    @Override
    public void sleep() {
        System.out.println("Rabbit is sleeping");
    }    
}
