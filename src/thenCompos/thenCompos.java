package thenCompos;

import java.util.concurrent.*;

public class thenCompos {

    public static  void main(String[] args){
        try{
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1,1,10, TimeUnit.HOURS,new ArrayBlockingQueue<>(10) ,Executors.defaultThreadFactory(),new ThreadPoolExecutor.AbortPolicy());

            CompletableFuture<String> asyncTask1 = CompletableFuture.supplyAsync(()->{

                return "concept";
            },executor).thenComposeAsync((String val)->{
                return CompletableFuture.supplyAsync(()-> val+"world");}).thenComposeAsync((String val)->{

             return  CompletableFuture.supplyAsync(()->val+"world");});

            CompletableFuture<String> compFutureObj2 = asyncTask1.thenCompose((String val)->{
                return  CompletableFuture.supplyAsync(()-> val+"All");
            });

        }
        catch(Exception ex){

        }
    }



}
