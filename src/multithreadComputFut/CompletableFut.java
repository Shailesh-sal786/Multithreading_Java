package multithreadComputFut;

import java.util.concurrent.*;

public class CompletableFut {

    public static void amin(String[] args){
        try{
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());
            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{

                try{
                    System.out.println("Current Thread is "+Thread.currentThread().getName());
                    Thread.sleep(5000);

                }
                catch(Exception ex){

                }
                return "concept";

            },poolExecutor);
            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(()->{

                try{
                    System.out.println("Current Thread is "+Thread.currentThread().getName());
                    Thread.sleep(5000);

                }
                catch(Exception ex){

                }
                return "Good One";

            },poolExecutor);

        }


        catch(Exception ex){

        }
    }
}
