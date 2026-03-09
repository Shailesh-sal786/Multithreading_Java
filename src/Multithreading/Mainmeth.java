package Multithreading;

public class Mainmeth {
    public  static void main(String [] args){
        ThreadPriority obj = new ThreadPriority();
        Thread th1 =  new Thread(()->{

            try {
                obj.display1();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread th2 =  new Thread(()->{

            obj.display2();
        });
        Thread th3 =  new Thread(()->{

            obj.display3();
        });
        Thread th4 =  new Thread(()->{

            obj.display4();
        });
        th1.setPriority(5);
        th2.setPriority(Thread.MAX_PRIORITY);
        th3.setPriority(Thread.MIN_PRIORITY);
        th4.setPriority(4);
        //It is basically used to set daemon as true that is
        th1.setDaemon(true);

        th1.start();
        System.out.println(th1.getName());
        System.out.println(th1.getId());
        th2.start();
        th3.start();
        th4.start();
//Prioriy tells jvm,a it should be given priority in this orde but it is not strictly followed, may b eon exceute first other later and so on
        System.out.println(Thread.currentThread().getName()+"Main thread got finished");

    }
}
