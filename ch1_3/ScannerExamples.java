package ch1_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args){
        // example 1:
//        Scanner sc = new Scanner(System.in);
//        //int i = sc.nextInt();
//        System.out.println("enter something");
//        String i = sc.next();
//        System.out.println("Getting from input: " + i);


        // example 2:
        scanFromFile();

        // exmample 3:
        //scanWithDelimiter();
    }


    public static void scanWithDelimiter(){
        String input = "1 fish 2 fish red fish blue fish";
        Scanner s = new Scanner(input).useDelimiter("\\s*fish\\s*");
        System.out.println(s.nextInt());
        System.out.println(s.nextInt());
        System.out.println(s.next());
        System.out.println(s.next());
        s.close();
    }

    /*
    When reading from file using scanner, focus on the following points
    1. Scanner constructor
    2. Handle the exception when open the file using Scanner
    3. Remember to close the scanner after usage ( this can be guaranteed by finally block)

     */
    public static void scanFromFile()  {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("ch1_3/myNumbers"));
            while (sc.hasNextLong()) {
                long aLong = sc.nextLong();
                System.out.println(aLong);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            if(sc != null){
                sc.close();
            }
        }

    }
}
