package Multithreading;

public class MonitorLockMain {

    public static void main(String[] args){

        MonitorLockExample obj = new MonitorLockExample();
       // Thread t1= new Thread(()->{obj.task1();});
        MonitorThreadRunnable mon = new MonitorThreadRunnable(obj);
        Thread t1 = new Thread(mon);
        Thread t2= new Thread(()->{obj.task2();});
        Thread t3= new Thread(()->{obj.task3();});

        t1.start();
        t2.start();
        t3.start();

    }
}
