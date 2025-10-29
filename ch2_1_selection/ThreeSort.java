package ch2_1_selection;

public class ThreeSort {

    public static int max(int x, int y, int z){
        int max = x;

        if(max < y){
            max = y;
        }

        if(max < z){
            max = z;
        }

        return max;

    }

    public static void main(String[] args){
        int a = 0;
        int b = 1;
        int c = 2;
        System.out.println(max(a,b,c));
    }



}
