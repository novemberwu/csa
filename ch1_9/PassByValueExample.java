package ch1_9;

public class PassByValueExample {

    
    public static void swapPrimitives(int a, int b){
        System.out.println("Before execution");
        System.out.println(a);
        System.out.println(b);
        int t = a;
        a = b;
        b = t;

        System.out.println("After execution");
        System.out.println(a);
        System.out.println(b);


    }

    public static void main(String[] args){
        int a = 1;
        int b = 2;
        swapPrimitives(a, b);
        System.out.println("Additional print from main");

        System.out.println("After execution inside main");
        System.out.println(a);
        System.out.println(b);
        
        


    }
}
