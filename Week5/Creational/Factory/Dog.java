package Week5.Creational.Factory;

public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");    
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }    
}
