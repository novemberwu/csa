package ch1_2;

public class StringEqualsExamples {


    public static void main(String[] args){
        String s1 = "hello"; // Stored in the String Pool
        String s2 = "hello"; // Refers to the same object in the String Pool
        String s3 = new String("hello"); // Creates a new object in the heap
        String s4 = new String("hello");

        System.out.println("s1 == s2: " + (s1 == s2)); // true (same object in String Pool)
        System.out.println("s1 == s3: " + (s1 == s3)); // false (different objects in memory)
        System.out.println("s3 == s4: " + (s3 == s4)); // false (different objects in memory)

        System.out.println("s1 equals s2: " + (s1.equals(s2))); // true (same content)
        System.out.println("s1 equals s3: " + (s1.equals(s3))); // true (same content)
        System.out.println("s3 equals s4: " + (s3.equals(s4))); // true (same content)



    }

}
