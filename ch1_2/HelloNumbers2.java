package ch1_2;

public class HelloNumbers2 {
    public static void main(String[] args){
        int x = 0;
        while( x < 3){
            System.out.println(x);
            x++;
        }

        System.out.println(((Object) x).getClass().getSimpleName());

/*        x = "Horse";
        System.out.println(x);
        System.out.println(((Object) x).getClass().getSimpleName());*/



    }
}
