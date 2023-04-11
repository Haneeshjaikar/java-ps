package Week3;

public class DaemonThread extends Thread {

    public DaemonThread(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName() + " thread is running");
    }

    public void check() {
        if (this.isDaemon()) {
            System.out.println(this.getName() + " thread is demon thread");
        } else {
            System.out.println(this.getName() + " thread is not demon thread");
        }
    }

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");

        t1.setDaemon(true);
        t1.start();
        t2.start();
        t1.check();
        t2.check();

    }
}
