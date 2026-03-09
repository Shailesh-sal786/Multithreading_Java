package Multithreading;

public class SharedResource {

    boolean itemAvailable = false;

    public synchronized void addItem(){
        itemAvailable = true;
        System.out.println("Item added by :"+Thread.currentThread().getName()+"and invoking");

        notifyAll();

    }

    public synchronized void consume(){
        System.out.println("Consume method invoked by :"+ Thread.currentThread().getName());

        while (!itemAvailable){
            try{
                System.out.println("Consumer thread is waiting");
                wait(); // it relaease monitor lock

            }
            catch (Exception e){

            }
        }

        System.out.println("Item consumed by :"+Thread.currentThread().getName());
        itemAvailable =false;
    }

}
