import workstealingPool.Sample2;

public class Sample {


    public static void main(String[] args){

        //Even you can write method returning something without storing it into any variable
        createOne(5);
        Sample2 samp = new Sample2();
        Integer res = samp.cal();
      //  Hre we can stoirng a method result by calling with the help of object and storing to other object;
        System.out.println(res);
    }

    private static int  createOne(int i) {
        return i;
    }
}
