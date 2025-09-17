package ch1_2;

public class StringDemo {
    public static void main(String[] args){

        String s = "This is a String";
        System.out.println(s);

        String t = new String("This is a another String");
        System.out.println(t);

        s = s + "Hello";
        System.out.println(s);

        s = s + 9;


        s = "99";
        int a = Integer.valueOf(s);
        System.out.println(s);


    }


}
