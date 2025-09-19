package ch1_5;

public class VariableRangeExamples {

    public static void main(String[] args ){


        int bigNumber = 2147483647;
        System.out.println("bigNumber: " + bigNumber);
        System.out.println(bigNumber + " plus 1: " + (bigNumber + 1));
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);

        System.out.println("--------------------------------");

        int smallNumber = -2147483648;
        System.out.println("smallNumber: " + smallNumber);
        System.out.println(smallNumber + " minus 1: " + (smallNumber - 1));
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);

        /*ADD YOUR CODE HERE*/
        // Adding the following code
        //System.out.println("bigNumber as double: " + (double)bigNumber);
        //System.out.println(bigNumber + " (as double) plus 1: " + ((double)bigNumber + 1));
    }
}
