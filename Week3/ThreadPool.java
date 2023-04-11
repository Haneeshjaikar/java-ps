package Week3;

import java.util.concurrent.Callable;
import java.util.*;
import java.util.concurrent.*;

public class ThreadPool implements Callable<String> {

    @Override
    public String call() throws Exception {
        Thread.sleep(10000);
        return Thread.currentThread().getName();
    }

    public static void main(String args[]) {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        ExecutorService executor1 = Executors.newCachedThreadPool();
        List<Future<String>> list = new ArrayList<>();
        List<Future<String>> list1 = new ArrayList<>();
        Callable<String> callable = new ThreadPool();
        for (int i = 0; i < 20; i++) {
            Future<String> future1 = executor1.submit(callable);
            Future<String> future = executor.submit(callable);
            list.add(future);
            list1.add(future1);
        }
        for (Future<String> fut : list) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        for (Future<String> fut : list1) {
            try {
                System.out.println(new Date() + "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();
        executor1.shutdown();
    }
}
