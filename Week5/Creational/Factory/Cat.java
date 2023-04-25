package Week5.Creational.Factory;

public class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");    
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }    
}
