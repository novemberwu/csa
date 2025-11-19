package ch4_4array_algo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FXRateManager {

    public static  void main(String[] args){
        FXRate[] rates = scanFromFile();
    }

    private static final String USD = "USD";
    private static final String CNY = "CNY";


    private static FXRate createRate(String date, double rate){
        return  new FXRate(USD, CNY, rate, date);
    }

    public static FXRate[] scanFromFile()  {
        Scanner sc = null;

        FXRate[] rates = new FXRate[31];

        try {
            // initialize scanner to read from a file
            sc = new Scanner(new File("ch4_4array_algo/USD_CNY_FX.csv"));
            // read from scanner until nothing left
            int i = 0;
            while (sc.hasNextLine()) {
                String line = sc.nextLine();

                String[] strs = line.split(",");
                rates[i++] = createRate(strs[0], Double.parseDouble(strs[1]));

                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            // handle the file not found error
            throw new RuntimeException(e);
        }finally {
            // close the scanner to prevent resource leak
            if(sc != null){
                sc.close();
            }
        }

        return rates;
    }
}
