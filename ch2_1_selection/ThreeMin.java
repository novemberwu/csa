package ch2_1_selection;

public class ThreeMin {
    public static int min(int a, int b , int c){

        int result = a;
        if(result > b){
            result = b;
        }

        if(result > c){
            result = c;
        }


        return result;// this is a placeholder, you are free to delete them

    }

    public static void main(String[] args){
        int a = 100;
        int b = 100;
        int c = -22;

        int result = min(a, b, c);
        System.out.println(result);

    }

}
