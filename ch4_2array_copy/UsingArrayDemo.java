package ch4_2array_copy;

import java.util.Arrays;

public class UsingArrayDemo {

    public static void print(int[] a){
        System.out.println();
        for(int i = 0; i < a.length; i++){
           System.out.print(a[i] +" ");
        }
    }
    public static void main(String[] args){
        int n = 10;
        int m = 22;
        swapPrimative(n, m);

    }

    public static void swapPrimative(int a, int b){

        System.out.println(a + " " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


    }

    public static void negative(int[] a){
        for(int i = 0; i < a.length; i++){
            a[i] = -a[i];
        }
    }

    public static void absoluteValue(int[] a){
        // your implementation here
        for(int i = 0; i < a.length; i++){
            a[i] = Math.abs(a[i]);
        }
    }


}
