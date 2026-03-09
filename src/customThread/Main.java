package customThread;

import threadpoolexecutor.CustomThreadFactory;

import java.util.concurrent.*;

class CustomThreadFactoryBasic implements ThreadFactory{
    @Override
    public Thread newThread(Runnable r){
        Thread th = new Thread(r);
        th.setPriority(Thread.NORM_PRIORITY);
        th.setDaemon(false);
        return th;
    }
}

class CustomRejectHandler implements  RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println("Task Rejected :"+r.toString());


    }
}

public class Main {

    public static void main(String[] args){
    ThreadPoolExecutor executor = new ThreadPoolExecutor(2,4,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(2), Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardPolicy());

/*
        ThreadPoolExecutor executor  = new ThreadPoolExecutor(2,4,10,TimeUnit.MINUTES,new ArrayBlockingQueue<>(10),new CustomThreadFactory().CustomRejectHandler());
*/

    executor.allowCoreThreadTimeOut(true);
    for(int i=0;i<=7;i++){
        executor.submit(()->{
            System.out.println("Task Processed by :"+Thread.currentThread().getName());

        });
    }
    executor.shutdown();







    }


}
