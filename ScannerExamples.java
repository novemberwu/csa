import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args){

        //scanFromFile();

//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//        //String i = sc.next();
//        System.out.println("Getting from input: " + i);

        scanWithDelimiter();
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

    public static void scanFromFile()  {
        Scanner sc = null;
        try {
            sc = new Scanner(new File("myNumbers"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (sc.hasNextLong()) {
            long aLong = sc.nextLong();
            System.out.println(aLong);
        }
    }
}
