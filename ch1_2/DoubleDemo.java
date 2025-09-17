package ch1_2;

public class DoubleDemo {

    public static void main(String[] args){
        double a = 0.1 + 0.2;
        double b = 0.3;

        double epsilon = 1e-9;
        // the absolute value of the difference of 2 double is less than epsilon
        // then we consider them to be equal
        if(Math.abs(a-b) < epsilon){
            System.out.println("Considered Equal");

        }

        if(a == b){
            System.out.println("Equal");
        }

        System.out.println(a);
        System.out.println(b);


    }
}
