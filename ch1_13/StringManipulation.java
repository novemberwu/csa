package ch1_13;

public class StringManipulation {

    public static void main(String[] args){

        String s = "Java";
//        s.length();
//        System.out.println(s.length());
//
//        int index = s.indexOf('a');
//        System.out.println(index);
//
//        index = s.indexOf('a', 2);
//        System.out.println(index);
//
//        index = s.indexOf("av");
//        System.out.println(index);
//
//        index = s.indexOf("av",2);
//        System.out.println(index);
//
//        String str =  s.substring(1,3);
//        System.out.println(str);

        s = "to be or not to be";
        String t = s.substring(1,3);
        System.out.println(t);

        String email = "rachel.jing@hotmail.com";

        int Randomnum1 = (int) (Math.random() * email.substring(0,email.indexOf('.')).length());

        int Randomnum2 = (int) (Math.random() * (email.substring(email.indexOf('.') + 1,email.indexOf('@')).length() -2));


    }
}
