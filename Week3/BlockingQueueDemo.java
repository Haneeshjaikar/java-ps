package Week3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args)
            throws InterruptedException {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        t1.start();
        t2.start();

    }

    public static class PC {

        static BlockingQueue<Integer> list = new LinkedBlockingQueue<>(1);

        public void produce() throws InterruptedException {
            int value = 0;
            while (true) {
                {
                    System.out.println("Producer value : " + value);
                    list.put(value++);
                    Thread.sleep(1000);
                }
            }
        }

        public void consume() throws InterruptedException {
            while (true) {
                {
                    int val = list.take();
                    System.out.println("Consumer value got : " + val);
                    Thread.sleep(1000);
                }
            }
        }
    }
}
