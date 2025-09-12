package ch1_2;

public class HelloNumbers {
    public static void main(String[] args){
        int x = 0;
        while( x < 3){
            System.out.println(x);
            x++;
        }

        System.out.println(((Object) x).getClass().getSimpleName());

    }
}
