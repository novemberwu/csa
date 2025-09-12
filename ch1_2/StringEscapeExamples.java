package ch1_2;

public class StringEscapeExamples {


    public static void main(String[] args){

        // Double quote
        String quote = "He said, \"Hello!\"";
        System.out.println(quote); // Output: He said, "Hello!"
        // Backslash
        String path = "C:\\Program Files\\Java";
        System.out.println(path); // Output: C:\Program Files\Java
        // New line
        String multiLine = "Line 1\nLine 2";
        System.out.println(multiLine);


        String multiLineString = """
    This is the first line.
    This is the second line.
    And this is the third line.
    """;
       // System.out.println(multiLineString);


    }
}
