package Multithreading;

public class Main {

    public static void main(String[] args){
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(()->{
            try{
                Thread.sleep(2000);


            }
            catch (Exception ex){

            }
            sharedResource.addItem();
        });

        Thread consumerThread = new Thread(()->{
            sharedResource.consume();

        });
        producerThread.start();
        consumerThread.start();


    }
}
