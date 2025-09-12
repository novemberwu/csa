package ch1_2;

public class StringImmutableExample {
    public static void main(String[] args){
        String a = "Hello Rachel";
        String b = a.replace("Hello", "Bye");
        System.out.println(a);
        System.out.println(b);
    }
}
