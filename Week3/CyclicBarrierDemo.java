package Week3;

import java.util.*;
import java.util.concurrent.*;

public class CyclicBarrierDemo {

    private CyclicBarrier cyclicBarrier;
    private List<List<Integer>> partialResults = Collections.synchronizedList(new ArrayList<>());
    private Random random = new Random();
    private int NUM_PARTIAL_RESULTS;
    private int NUM_WORKERS;

    private void runSimulation(int numWorkers, int numberOfPartialResults) {
        NUM_PARTIAL_RESULTS = numberOfPartialResults;
        NUM_WORKERS = numWorkers;

        cyclicBarrier = new CyclicBarrier(NUM_WORKERS, new AggregatorThread());
        for (int i = 0; i < NUM_WORKERS; i++) {
            Thread worker = new Thread(new NumberCruncherThread());
            worker.setName("Thread " + i);
            worker.start();
        }
    }

    class NumberCruncherThread implements Runnable {

        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();
            List<Integer> partialResult = new ArrayList<>();
            for (int i = 0; i < NUM_PARTIAL_RESULTS; i++) {
                Integer num = random.nextInt(10);
                System.out.println(thisThreadName + ": " + num);
                partialResult.add(num);
            }
            partialResults.add(partialResult);
            try {
                System.out.println(thisThreadName + " waiting for others to reach barrier.");
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }

    class AggregatorThread implements Runnable {

        @Override
        public void run() {
            String thisThreadName = Thread.currentThread().getName();
            System.out.println(thisThreadName + ": Computing final sum");
            int sum = 0;
            for (List<Integer> threadResult : partialResults) {
                for (Integer partialResult : threadResult) {
                    sum += partialResult;
                }
            }
            System.out.println(Thread.currentThread().getName() + ": Final result = " + sum);
        }

    }

    public static void main(String[] args) {
        CyclicBarrierDemo play = new CyclicBarrierDemo();
        play.runSimulation(5, 3);
    }

}
