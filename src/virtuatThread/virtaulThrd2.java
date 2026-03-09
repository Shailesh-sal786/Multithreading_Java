package virtuatThread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class virtaulThrd2 {

    public static void main(String[] args){

        ThreadLocal<String> threadLocalObj = new ThreadLocal<>();
        ExecutorService poolObj =  Executors.newFixedThreadPool(5);

        poolObj.submit(() ->{
            threadLocalObj.set(Thread.currentThread().getName());

            // it will clean the thtreadpoollocal with value associated with it
            threadLocalObj.remove();

        });
        for(int i =1;i<15;i++){
            poolObj.submit(()->{
                System.out.println(threadLocalObj.get());

            });
        }

    }
}
