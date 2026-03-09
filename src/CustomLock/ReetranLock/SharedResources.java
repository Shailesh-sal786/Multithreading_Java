package CustomLock.ReetranLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResources {
    boolean isAvailaible = false;
    public  void producer(ReentrantLock lock){

        try{
            lock.lock();
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
            isAvailaible = true;
            Thread.sleep(4000);
        }
        catch(Exception ex){

        }
        finally{
            System.out.println("Lock released by:"+Thread.currentThread().getName());
            lock.unlock();

        }


    }
}
