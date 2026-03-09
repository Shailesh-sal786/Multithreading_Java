package Seemaphore;

import java.util.concurrent.Semaphore;

public class SharedResource40 {

    boolean isAvailaible = false;
    Semaphore lock = new Semaphore(2);

    public  void producer(){
        try {
            lock.acquire();
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
            isAvailaible = true;
            Thread.sleep(4000);
        }catch(Exception ex){

        }
        finally{
            System.out.println("Lock releseby :"+ Thread.currentThread().getName());
            lock.release();

        }


    }
}
