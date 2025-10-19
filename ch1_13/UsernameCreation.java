package ch1_13;

public class UsernameCreation {

    public static void main(String[] args){
        String email = "rachel.jing@hotmail.com";
        int indexAt = email.indexOf('@');
        int indexDot = email.indexOf('.');

        String firstName = email.substring(0, indexDot);
        String lastName = email.substring(indexDot+1, indexAt);
        System.out.println(firstName);
        System.out.println(lastName);


    }
}
