package ch2_1_selection;

import java.util.Scanner;

public class TwoSort {
    public static void main(String[] args){
        System.out.println("Please enter 2 ints");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        if ( a > b){
            int t = a;
            a = b;
            b = t;
        }
        System.out.println(a);
        System.out.println(b);
    }
}
