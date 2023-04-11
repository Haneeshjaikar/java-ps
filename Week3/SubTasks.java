package Week3;

public class SubTasks {

    public static void main(String[] args) throws InterruptedException {
        Runnable r = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread [" + Thread.currentThread().getName() + "] executing");
        };
        Thread t1 = new Thread(r, "Thread 1");
        Thread t2 = new Thread(r, "Thread 2");
        Thread t3 = new Thread(r, "Thread 3");
        Thread t4 = new Thread(r, "Thread 4");

        t1.start();
        t1.join();

        t2.start();
        t2.join();

        t3.start();
        t3.join();

        t4.start();
        t4.join();

        System.out.println("Thread [" + Thread.currentThread().getName() + "] executing");
        // We can see that the main thread is executing after the completion of the
        // above threads
        // join() method allows one thread to wait until another thread completes its
        // execution.
    }
}
