package Week3;

public class InterruptDemo extends Thread {
    public void run() {
        try {
            System.out.println("Thread started");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Woke up in the middle of sleep");
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new InterruptDemo();
        t1.start();
        t1.interrupt();
    }
}
