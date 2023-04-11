package Week3;

public class SequenceN extends Thread {

    public int n = 10;
    static int start = 1;
    int remainder;
    static Object object = new Object();

    SequenceN(int remainder) {
        this.remainder = remainder;
    }

    public void run() {
        while (start < n - 1) {
            synchronized (object) {
                while (start % 3 != remainder) { // wait for numbers other than remainder
                    try {
                        object.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " " + start);
                start++;
                object.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new SequenceN(1), "Thread 1");
        Thread t2 = new Thread(new SequenceN(2), "Thread 2");
        Thread t3 = new Thread(new SequenceN(0), "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }

}