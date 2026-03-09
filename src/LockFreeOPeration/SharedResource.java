package LockFreeOPeration;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    AtomicInteger counter = new AtomicInteger(0);


    public void increment(){
        counter.incrementAndGet();


    }

    public AtomicInteger get(){
        return  counter;


    }
}
