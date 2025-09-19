package ch1_5;

public class Bank {
    private int balance;               // Current balance of the bank account
    private int maxBalance = Integer.MAX_VALUE;

    public static void main(String[] args){
        Bank bank = new Bank(1000);
        boolean result = bank.increaseBalance(100);
        result = bank.increaseBalance(Integer.MAX_VALUE);
    }

    /*
     * Constructs a Bank object with the specified initial balance
     */
    public Bank(int balance) {
        this.balance = balance;
    }

    /*
     * Returns the current balance of the bank account
     */
    public int getBalance() {
        return balance;
    }

    /*
     * Increases the balance of the bank account by the specified amount
     * if the resulting balance does not overflow
     *
     * returns true if the balance is successfully increased, false otherwise
     */
    public boolean increaseBalance(int amount){

        /* ----------------------------------- TO DO -----------------------------------
         * ✅ Write a conditional to check if the amount increased has caused an overflow
         * error. If it has, do not change the balance, and return false. If it hasn't,
         * increase the balance by amount.
         * -----------------------------------------------------------------------------
         */
       return false;

    }
}
