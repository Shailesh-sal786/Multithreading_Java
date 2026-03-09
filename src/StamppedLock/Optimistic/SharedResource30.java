package StamppedLock.Optimistic;

import java.util.concurrent.locks.StampedLock;

public class SharedResource30 {
    int a =10;
    StampedLock lock = new StampedLock();

    public void producer(){
        long stamp = lock.tryOptimisticRead();

        try{
            System.out.println("Taken optimistic lock "+Thread.currentThread().getName());
            a =11;
           /* Thread.sleep(10000);*/

            if(lock.validate(stamp)){
                System.out.println("update a value successfully"+Thread.currentThread().getName());

            }else{
                a=10;
                System.out.println("Roll back of work"+Thread.currentThread().getName());

            }

        }
        catch(Exception ex){

        }
          finally{
            System.out.println("End of code"+Thread.currentThread().getName());

        }

    }
    public void consumer(){
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired:"+Thread.currentThread().getName());
        try{
            System.out.println("performing work"+Thread.currentThread().getName());
            a=9;

        }catch(Exception ex){

        }
        finally{
            System.out.println("Write lock released by:"+Thread.currentThread().getName());
            lock.unlockWrite(stamp);



        }

    }

}
