package Multithreading;

public class MonitorThreadRunnable implements Runnable{


    MonitorLockExample obj;
    public MonitorThreadRunnable(MonitorLockExample obj) {
        this.obj = obj;
    }

    // we can run multiple method either calling inside run method or by pasing directly as paamter while creating object of thrread

    @Override
    public void run() {
        obj.task1();

    }
}
