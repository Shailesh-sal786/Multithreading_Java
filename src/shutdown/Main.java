package shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args){
        ExecutorService poolObj = Executors.newFixedThreadPool(5);

        poolObj.submit(()->{
            System.out.println("Thread going to start to work");
        });

        poolObj.shutdown();

    /*    poolObj.submit(()->{
            System.out.println("Thread going to start to work");
        });*/
        //

       System.out.println("Main thread ended here");

    }

}
