package Week3;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        System.out.println("Thread main started");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> returnedValues = executorService.submit(new SumNumbers(10));
        System.out.println("Result of Future object:: " + returnedValues.get());
        executorService.shutdown();

        System.out.println("Thread main finished");
    }
}

class SumNumbers implements Callable<Integer> {
    private int n;

    public SumNumbers(int n) {
        this.n = n;
    }

    public Integer call() {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum += i;
        }
        System.out.println("[" + Thread.currentThread().getName() + "] of sum " + sum);
        return sum;
    }
}