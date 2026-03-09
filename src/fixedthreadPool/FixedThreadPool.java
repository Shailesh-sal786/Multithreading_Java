package fixedthreadPool;

import java.util.concurrent.*;

public class FixedThreadPool {

    public static  void main(String[] args){

    ExecutorService executor = Executors.newFixedThreadPool(5);
    ExecutorService executor1 = Executors.newCachedThreadPool();
        ThreadPoolExecutor executor3 = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());


    }
}
