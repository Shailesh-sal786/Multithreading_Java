package Multithreading;

public class ThreadPriority {

    public synchronized  void display1() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("You are in display 1");
    }

        public  void display2(){
            System.out.println("You are in display 2");
        }

        public  void display3(){
            System.out.println("You are in display 3");
        }

        public  void display4(){
            System.out.println("You are in display 4");
        }


    }

