package virtuatThread;

public class virtualThrd {

    public static void main(String[] args){

        ThreadLocal<String> threadLocal = new ThreadLocal<>();
        threadLocal.set(Thread.currentThread().getName());

        Thread t1 = new Thread(()->{
            threadLocal.set(Thread.currentThread().getName());
            // Here we are printing thread local value for thread1
            System.out.println(threadLocal.get());

        });
        t1.start();

        //hERE THIS LINE RUN IN MAIN THREAD SO IT PRINTED MAIN THREAD NAME AS THREADLOCAL STORE VALUE PEFR THREAD DONT SHARE VALUE
        System.out.println(threadLocal.get());





    }
}
