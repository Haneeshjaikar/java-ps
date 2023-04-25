package Week5.Creational.Factory;

public class Main {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
      
        Animal animal = animalFactory.getAnimal("dOg");
        animal.eat();
        animal.sleep();
      
        Animal animal2 = animalFactory.getAnimal("CAT");
        animal2.eat();
        animal2.sleep();
      
        Animal animal3 = animalFactory.getAnimal("raBbIt");
        animal3.eat();
        animal3.sleep();
    }
}