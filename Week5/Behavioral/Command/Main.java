package Week5.Behavioral.Command;

public class Main {
    public static void main(String[] args) {

        // command
        Application application = new Application();
        
        //wrapping requests
        MakeApplication makeApplication = new MakeApplication(application);
        SellApplication sellApplication = new SellApplication(application);

        // invoker
        Programmer programmer = new Programmer();
        programmer.takeOrder(makeApplication);
        programmer.takeOrder(sellApplication);

        // invoker processed the wrapped request
        programmer.placeOrders();
    }
}