package Week5.Behavioral.Command;

public class MakeApplication implements Order {
    private Application application;
    
    public MakeApplication(Application application) {
        this.application = application;
    }
    
    @Override
    public void placeOrder() {
        application.make();
    }
}