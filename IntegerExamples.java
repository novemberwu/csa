public class IntegerExamples {



    public static void swap(){
        int a = 5;
        int b = 10;
        int tmp ;
        System.out.println("before the swap");

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        tmp = a;
        a = b;
        b = tmp;

        System.out.println("after the swap");
        System.out.println("a:"+a);
        System.out.println("b:"+b);

    }


    public static void minAndMax(){
        System.out.println("max int value:" + Integer.MAX_VALUE);
        System.out.println("min int value:" + Integer.MIN_VALUE);
    }


    public static void main(String[] args ){
        minAndMax();



    }
}
