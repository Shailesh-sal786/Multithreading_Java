package futurenandCallable;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureExample2 {

    public static void main(String[] args){
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1,1, 1 , TimeUnit.MINUTES, new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());

  Future<List<Integer>> futureObj=  poolExecutor.submit(()->{
         List<Integer> list= new ArrayList<>();
        list.add(1000);
         return list;
    });

  try{
     List<Integer> result = futureObj.get();
     System.out.println(result);

  }
  catch(Exception ex){

  }






}}
