package StamppedLock.Optimistic;

import Multithreading.SharedResource;

public class Main {

    public static void main(String[] args){
        SharedResource30 resource = new SharedResource30();
        SharedResource30 resource1 = new SharedResource30();

        Thread th1= new Thread(()->{
                resource.producer();
            });
        Thread th2= new Thread(()->{
            resource.consumer();
        });
        Thread th3= new Thread(()->{
            resource.producer();
        });
        Thread th4= new Thread(()->{
            resource.consumer();
        });

        Thread th5= new Thread(()->{
            resource1.producer();
        });
        Thread th6= new Thread(()->{
            resource1.consumer();
        });
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        th5.start();
        th6.start();

    }
}
