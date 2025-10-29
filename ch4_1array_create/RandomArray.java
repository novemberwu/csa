package ch4_1array_create;

import java.util.Scanner;

public class RandomArray {

    public static void  main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        double[] array = new double[n];
        for(int i =0 ; i < n; i++){
            array[i] = Math.random();
        }

        for(double d : array){
            System.out.println(d);
        }

    }
}
