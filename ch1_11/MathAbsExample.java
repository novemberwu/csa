package ch1_11;

public class MathAbsExample {
    public static void main(String[] args){


        int absMax = Math.abs(Integer.MAX_VALUE);
        System.out.println("Abs value of largest int:"+ absMax);

        absMax = Math.abs(Integer.MIN_VALUE);
        System.out.println("Abs value of smallest int:"+ absMax);

        absMax = Math.abs(Integer.MIN_VALUE -1 );
        System.out.println("Abs value of smallest int minus 1:"+ absMax);
    }

}
