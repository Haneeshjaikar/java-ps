package Week3;

class NewThread extends Thread {
    private static int question = 15;
    private static ThreadLocal<Integer> gfg = new ThreadLocal<>() {
        protected Integer initialValue() {
            return Integer.valueOf(question--);
        }
    };

    NewThread(String name) {
        super(name);
    }

    public void run() {

        for (int i = 0; i < 2; i++)
            System.out.println(getName() + " " + gfg.get());
    }
}

public class ThreadLocalDemo {

    public static void main(String[] args) {

        // Creating threads inside main() method
        NewThread t1 = new NewThread("quiz1");
        NewThread t2 = new NewThread("quiz2");

        t1.start();
        t2.start();
    }
}
