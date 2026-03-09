package thenCombin;

import java.util.concurrent.*;

public class thenCombin {

    public static void main(String[] args){

        try{

            ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1,1, TimeUnit.HOURS,new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());
            CompletableFuture<Integer> asyncTask1 = CompletableFuture.supplyAsync(()->{
                return 10;

            });
            CompletableFuture<String> asyncTask2 = CompletableFuture.supplyAsync(()->{
                return "Kite";

            });
            CompletableFuture<String> combineCompletableFut = asyncTask1.thenCombine(asyncTask2,(Integer val1, String val2)->{
                return val1 + val2;

            });

        }
        catch(Exception ex){

        }

    }
}
