package Week5.Behavioral.Template;

public abstract class Employee {
    abstract void work();
    abstract void takePause();
    abstract void getPaid();
    
    public final void comeToWork() {
        work();
        takePause();
        work();
        getPaid();
    }
}