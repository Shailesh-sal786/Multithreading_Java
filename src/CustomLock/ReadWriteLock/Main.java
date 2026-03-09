package CustomLock.ReadWriteLock;



import CustomLock.ReetranLock.SharedResources;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main (String[] args){
  //Here ReentrantReadwrite lock is implementation class of ReadWrite lock
        ReadWriteLock lock = new ReentrantReadWriteLock();


        SharedResources1 resource1 = new SharedResources1();

        Thread th1 = new Thread(()->{
            resource1.producer(lock);

        });


        Thread th2 = new Thread(()->{
            resource1.producer(lock);

        });
        SharedResources1 resource2 = new SharedResources1();

        Thread th3 = new Thread(()->{
            resource2.Consume(lock);

        });
        Thread th4 = new Thread(()->{
            resource2.Consume(lock);

        });
        th4.start();
        th3.start();
        th1.start();
        th2.start();



    }
}
