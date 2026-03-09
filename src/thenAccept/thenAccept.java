package thenAccept;

import java.util.concurrent.*;

public class thenAccept {

    public static void main(String[] args){

        try{
            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1  = CompletableFuture.supplyAsync(()->{
                return "concept";

            },poolExecutor);
            asyncTask1.thenAccept((String val)->{
                System.out.println("Printing value"+val);

            });


        }
        catch(Exception ex){

        }


    }

}
