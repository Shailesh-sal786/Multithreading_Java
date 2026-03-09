package Synchronized;

public class SharedResource {
    boolean isAvailaible = false;

    public synchronized  void producer(){
        try{
            System.out.println("Lock acquired by :"+Thread.currentThread().getName());
            isAvailaible = true;
            Thread.sleep(4000);
        }
        catch(Exception ex){

        }

        System.out.println("Lock released by:"+Thread.currentThread().getName());
    }
}
