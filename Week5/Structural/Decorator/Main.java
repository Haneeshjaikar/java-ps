package Week5.Structural.Decorator;

public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new GamingComputer(new BasicComputer());
        gamingComputer.assemble();
        System.out.println("\n");
        
        Computer workComputer = new WorkComputer(new GamingComputer(new 
            BasicComputer()));
        workComputer.assemble();
    }
}
