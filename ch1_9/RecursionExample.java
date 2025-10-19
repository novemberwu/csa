package ch1_9;

public class RecursionExample {
    static int calculateFactorial(int n) {
        // Base case: if n is 0, return 1 (0! is 1)
        if (n == 0) {
            return 1;
        }
        // Recursive step: n * factorial of (n-1)
        else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 5;
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result); // Output: Factorial of 5 is: 120
    }
}