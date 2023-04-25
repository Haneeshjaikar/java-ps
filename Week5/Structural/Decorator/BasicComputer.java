package Week5.Structural.Decorator;

public class BasicComputer implements Computer {
    @Override
    public void assemble() {
        System.out.print("Assembling a basic computer.");
    }
}