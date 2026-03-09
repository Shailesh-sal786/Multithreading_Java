package StamppedLock.PassimisticReadwrite;

import java.util.concurrent.locks.StampedLock;

public class SharedResource20 {

    boolean isAvailaible = false;
    StampedLock lock = new StampedLock();

    public void producer()  {
        long stamp = lock.readLock();
        try{
            System.out.println("Read Lock is acquired by"+Thread.currentThread().getName());
            isAvailaible = true;
            Thread.sleep(6000);

        }catch(Exception ex){


        }
        finally{
            lock.unlock(stamp);
            System.out.println("Rock release by:"+Thread.currentThread().getName());

        }
    }

    public void consume(){
        long stamp = lock.writeLock();

        try{
            System.out.println("Write lock is acquired"+Thread.currentThread());
            isAvailaible = false;
        } catch(Exception ex){

        }finally{
            System.out.println("Write lock released by :"+Thread.currentThread().getName());
            lock.unlockWrite(stamp);

        }

    }

}
