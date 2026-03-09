package CustomLock.ReadWriteLock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SharedResources1 {
    boolean isAvailaible = false;
    public  void producer(ReadWriteLock lock){

        try{
            lock.readLock().lock();
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
            isAvailaible = true;
            Thread.sleep(8000);
        }
        catch(Exception ex){

        }
        finally{
            System.out.println("Lock released by:"+Thread.currentThread().getName());
            lock.readLock().unlock();

        }


    }

    public void Consume(ReadWriteLock lock){

        try {
            lock.writeLock().lock();
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailaible= false;
        }catch(Exception ex){

        } finally{
            lock.writeLock().unlock();

            System.out.println("Lock released by:"+Thread.currentThread().getName());


        }

    }
}
