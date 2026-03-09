package futurenandCallable;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample {
    public static void main(String[] args){
    ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1 , TimeUnit.MINUTES, new ArrayBlockingQueue<>(10),Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

        Future<?> futureObj1 = poolExecutor.submit(()->System.out.println("Something"));

        // Here since we are using Callable since here submit is returning something in this case Integer.
        Future<Integer> futureObj2 = poolExecutor.submit(()-> {
            System.out.println("Do Something");
            return 57;
        });

        List<Integer> output  = new ArrayList<>();

        // Here worker thread excute run() method inside MyRunnable Internally as start() , method deos in normal thead here submit() method deos
        Future<List<Integer>> futureObject = poolExecutor.submit(new MyRunnable(output),output);

        try{
            futureObject.get();
            // 1 way
            System.out.println(output.get(0));

            //2 way
            List<Integer> result = futureObject.get();
            System.out.println(result.get(0));
        }
        catch(Exception ex){

        }

}}
