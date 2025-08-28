package ch1_9;

public class StackOverflowExample {
    public static void recursiveMethod() {
        recursiveMethod(); // 递归调用自身，没有终止条件
    }

    public static void main(String[] args) {
        try {
            recursiveMethod();
        } catch (StackOverflowError e) {
            System.err.println("StackOverflowError caught: " + e); // catch StackOverflowError
        }
    }
}