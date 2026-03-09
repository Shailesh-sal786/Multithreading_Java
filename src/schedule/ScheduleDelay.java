package schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleDelay {

    public static  void main(String [] args){
        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);
//this function will waitg till first task got cokmplete then arrange secondtaskafter delay time and same goes on
//Here thread doesnot get schedule after 3 sec it will wait fdor task to complete then after 3 sec another task will exceuted
        Future<?> futureObj = poolObj.scheduleWithFixedDelay(()->{
            System.out.println("Thread picked the task");
            try{
                Thread.sleep(6000);
            }
            catch (Exception e){

            }
            System.out.println("Thread completed the task");

        },1,3, TimeUnit.SECONDS);


    }
}
