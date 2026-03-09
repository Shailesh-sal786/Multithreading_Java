package Multithreading;

public class HelloThread1 implements Runnable{

    @Override
    public void run(){
        System.out.println("Welcome to run  method"+" "+"which is created by implementing Runnable interface");
    }

}
