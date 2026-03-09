package workstealingPool;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;

public class main {

    public static  void main(String[] args){
       // ForkJoinPool pool1 = ForkJoinPool.commonPool();

        // Here you can also pass number of thread you want to create with the helpp of ForkThreadPool.

        ///ForkJoinPool pool2 = new ForkJoinPool(6);
        ForkJoinPool pool = ForkJoinPool.commonPool();
        //Hre eit is using Recursive task since returning omething, if doesnot return anything it will be trecusive actioj
        Future<Integer> futureObj = pool.submit(new ComputeSumTask(0,100));

        try{
            System.out.println(futureObj.get());

        }
        catch(Exception ex){

        }


    }

}
