package CustomLock;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CustomFactory {
    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());
        executor.allowCoreThreadTimeOut(true);

        for (int i = 1; i < 7; i++) {
            executor.submit(() -> {
                System.out.println("Task Processed by:" + Thread.currentThread().getName());

            });

        }
        executor.shutdown();

    }
}
