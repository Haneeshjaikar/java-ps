package Week5.Behavioral.Template;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Programmer();
        employee.comeToWork();
     
        System.out.println();
        
        employee = new Manager();
        employee.comeToWork();
    }
}
