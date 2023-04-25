package Week5.Behavioral.Command;

public class SellApplication implements Order {
    private Application application;
    
    public SellApplication(Application application) {
        this.application = application;
    }

    @Override
    public void placeOrder() {
        application.sell();
    }
}
