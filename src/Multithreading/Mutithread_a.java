package Multithreading;

public class Mutithread_a {


    public static void main(String[] args){

        Thread thread = new Thread();
        thread.start();

        Thread thread1 = new Thread(()->System.out.println("Hello from Java Thread"));
        thread1.start();


        //Here it is lambda expression as object of fucntional interface ie anynomous inner class
        Runnable  runnable =()->System.out.println("Hi from Java Thread");
        Thread thread2 = new Thread(runnable);

        // here we are passing object of runnable into constructor of thread class , thread class run()method call the method of Runnable interface
        thread2.start();
        // here when we call start() method it will call run method of thread class which call run method of Runnable implementing class

        Thread thread3 = new Thread();
         thread3.start();

         Thread thread4 = new Thread(new HelloThread1());
         thread4.start();
// Here Jvm is internally r.run();
         Thread thread5 = new Thread(Hello::sayHello);
         //here .start() method internally run run() methodx
          thread5.start();

          Runnable run = new HelloThread1();
          run.run();









        System.out.println("Welcome to main method");




    }
}
