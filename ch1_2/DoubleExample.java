package ch1_2;

public class DoubleExample {


    public static void compareDouble(){
        double d1 = 0.1 + 0.2; // d1 might be slightly different from 0.3
        double d2 = 0.3;
        double epsilon = 0.000001; // A small tolerance

        if (Math.abs(d1 - d2) < epsilon) {
            // d1 and d2 are considered approximately equal
            System.out.println("d1 and d2 are considered approximately equal");
        }

        if (d1 == d2){
            System.out.println("d1 and d2 are considered exactly equal");
        }
    }


    public static void calc(){
        double a = 5;
        double b = 3;
        System.out.println(a/b);

    }

    public static void mathExample(){
        System.out.println(Math.sqrt(2.0));
    }


    public static void main(String[] args){
       mathExample();
       compareDouble();

    }
}
