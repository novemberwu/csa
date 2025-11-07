package midTerm;

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
        this.storeName = "Default name";
    }
    public Store(String name){
        this.storeName = name;
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
        System.out.println(Store.getCount() + " stores");
    }
}
