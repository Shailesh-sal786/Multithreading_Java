package Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource50 {
    boolean isAvailaible = false;
    ReentrantLock lock = new ReentrantLock();

    Condition  condition = lock.newCondition() ;

    public void producer(){

        try{
            lock.lock();
            System.out.println("Produce lock acquired by:"+Thread.currentThread().getName());
            if(isAvailaible){
                //already availaible thread has to wait for it to consume.
                System.out.println("Produce thread is waiting"+Thread.currentThread().getName());
                condition.await();
            }
            isAvailaible =true;
            condition.signal();


        }
        catch (Exception ex){


        }finally {
            lock.unlock();
            System.out.println("Produce lock released by:"+Thread.currentThread().getName());
        }

    }

}
