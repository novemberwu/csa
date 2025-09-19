package ch1_5;

public class PennyCounter {
    public int getTotalPennies(double total){
        int totalPennies = (int) (total * 100);
        return totalPennies;
    }
    public static void main(String args[]) {

        double totalAsDouble = 4.6;
        System.out.println("$" + totalAsDouble);

        /* ---- 🔎 ADD YOUR CODE BELOW THIS LINE ---- */
        //PennyCounter myPennyCounter = new PennyCounter();
        //int totalAsInt = myPennyCounter.getTotalPennies(totalAsDouble );
        //System.out.println(totalAsInt + " pennies");

    }
}
