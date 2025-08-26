import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FxRate {

    public static LocalDate parseDate(String dateString){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateString, formatter);
        return date;
    }
    public static void parse(){
        try {
            Scanner scanner = new Scanner(new File("usd_cny_fx.csv"));

            while( scanner.hasNext()){
                String text = scanner.next();

                String[] columns = text.split(",");
                if(columns.length ==2){
                    columns[0].trim();
                    LocalDate date = parseDate(columns[0]);
                    Double rate = Double.parseDouble(columns[1]);
                    System.out.println(date + " "+rate);

                }


            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static void main(String[] args){
        parse();
    }
}
