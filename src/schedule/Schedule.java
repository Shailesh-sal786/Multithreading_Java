package schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule {

    public static void main(String[] args){

        //Here core pool size is minimum number of thread , max no of thread is Integer.MAX_VALUE.

        ScheduledExecutorService poolObj = Executors.newScheduledThreadPool(5);


        // Thread from scheduled thread will always alive don't die even idle
        //Here we have schedulr the task after 5 sec it will run, but it doesnot retuen any thing
 /*       poolObj.schedule(()->{
            System.out.println("hello");

        },5, TimeUnit.SECONDS);*/

        //        //Here we have schedulr the task after 3 sec it will run, but it  return any object as it is taking callable as argument
/*
       Future<String> pool = poolObj.schedule(()->{
           return "thread";

        },2, TimeUnit.SECONDS);

       try {

           System.out.println(pool.get());
       }
       catch(Exception e){

       }*/
//HERE TASK WILL INIRTIALLY START AFTER 3 SEC and then repeat after every 5 secs.
   /*   Future<?> futObj =  poolObj.scheduleAtFixedRate(()->{
           System.out.println("Welcome to schedule fixed thread");

       },3,5,TimeUnit.SECONDS);

       try{
           //Here main thread go t sleep
           Thread.sleep(10000);
           futObj.cancel(true);
       }catch(Exception ex){

       }*/
        //Here other taskgot schedelule after 5 sec and wait for first task to ciomplete start immediate afyer thjat

        Future<?> futObj1 =  poolObj.scheduleAtFixedRate(()->{
            System.out.println("Welcome to schedule fixed thread");
            try{
                //Here main thread go t sleep
                Thread.sleep(6000);

            }catch(Exception ex){

            }
            System.out.println("Thread complted the task");

        },3,5,TimeUnit.SECONDS);



    }
}
