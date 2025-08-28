package ch1_13;

public class StringExamples {
    public static void main(String[] args){
        // Case 1: String literals (interned in String Pool)
        String s1 = "hello";
        String s2 = "hello";

        System.out.println("--- Case 1: String Literals ---");
        System.out.println("s1 == s2: " + (s1 == s2)); // true (same object reference in String Pool)
        System.out.println("s1.equals(s2): " + s1.equals(s2)); // true (same content)

        // Case 2: Strings created using 'new' operator (new objects in Heap)
        String s3 = new String("world");
        String s4 = new String("world");

        System.out.println("\n--- Case 2: New String Objects ---");
        System.out.println("s3 == s4: " + (s3 == s4)); // false (different object references in Heap)
        System.out.println("s3.equals(s4): " + s3.equals(s4)); // true (same content)

        // Case 3: Comparing a literal with a new object
        String s5 = "java";
        String s6 = new String("java");

        System.out.println("\n--- Case 3: Literal vs. New Object ---");
        System.out.println("s5 == s6: " + (s5 == s6)); // false (different object references)
        System.out.println("s5.equals(s6): " + s5.equals(s6)); // true (same content)

    }




}
