package ch2_2_loop;

import lib.StdStats;

public class MathLimitEstimation {

    public static void main(String[] args){
        final int N = 10000;
        System.out.println("Limit: "+Math.PI * Math.PI/ 6);

        double result = 0;
        for (int i = 1; i <= N; i++){

            result += 1/(double)(i * i);

        }
        System.out.println("Approximation:" + result);
    }
}
