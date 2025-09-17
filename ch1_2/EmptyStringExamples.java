package ch1_2;

public class EmptyStringExamples {
    public static void main(String[]args){
        String str1 = "";
        String str2 = "I am a String";
        String str3 = new String("I am another String");

        String strEmpty = new String();
        String strNull = null;

//        System.out.println(str1);
//        System.out.println(str2);
//        System.out.println(str3);
//
//        System.out.println(strEmpty);
        System.out.println(strEmpty.length());
        // Can you print out null?
//        System.out.println(strNull);
        // Can you use the null String to do some work?
        System.out.println(strNull.length());

    }
}
