package StamppedLock.PassimisticReadwrite;

public class Main {

    public static void main(String[] args){

        SharedResource20 resource = new SharedResource20();

        Thread th1 = new Thread(()->
        {
            resource.producer();
        });
        Thread th2 = new Thread(()->
        {
            resource.producer();
        });
        Thread th3 = new Thread(()->
        {
            resource.consume();
        });

    }
}
