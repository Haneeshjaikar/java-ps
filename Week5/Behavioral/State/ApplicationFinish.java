package Week5.Behavioral.State;

public class ApplicationFinish implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("The application is in the finished state of development.");
        context.setState(this);
    }
    public String toString() {
        return "Finished state.";
    }    
}
