package threadpoolexecutor;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args){

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1 , TimeUnit.MINUTES, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

    }
}
