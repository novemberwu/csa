package midTerm;

import java.sql.SQLSyntaxErrorException;

public class Store {
    private static int count = 0;
    static {
        System.out.println("There are " + count + " stores.");
    }
    public static int getCount(){
        return count;
    }
    private String storeName;
    public Store(){
        storeName = "Default name";
        System.out.println("Inside Store()");
        count++;
    }
    public Store(String name){
        this.storeName = name;
        count++;
    }
    public String getName(){
        return this.storeName;
    }
    public void setName(String name){
        this.storeName = name;
    }
    public static double calculateBill(int amount, double price) {
        return price * amount;
    }
    public static void main(String[] args){
        System.out.println("Inside main");

        Store a = new Store();
        Store b = new Store("Tmall");
        Store c = new Store("JingDong");
        Store d = new Store("Amazon");

        System.out.println(Store.getCount());//4

        System.out.println("a's name " + a.getName());
        a.setName("Rachel's store ");
        System.out.println("a's name "+ a.getName());



    }
}
