package shutdown;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Shutdown2 {

    public static void main(String[] args){

        ExecutorService poolExecutorObj = Executors.newFixedThreadPool(5);

        poolExecutorObj.submit(()->{
            try{
                Thread.sleep(4000);//here this line throws intrupted exception, so code will jump to catch block where ther
                System.out.println("new task");

            }catch(Exception e){

            }
            System.out.println("new task before  sleep");

        });

        poolExecutorObj.shutdown();
       // poolExecutorObj.shutdownNow();

        try {
           boolean isTerminated =  poolExecutorObj.awaitTermination(2, TimeUnit.SECONDS);
           System.out.println(isTerminated);
           System.out.println("jUST CHECKING STATUS OF THREAD POOL");
        }
        catch(Exception ex){

        }
        System.out.println("main thread unblocked finished processing");
    }
}
