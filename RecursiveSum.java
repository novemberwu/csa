public class RecursiveSum {

    // assuming n >= 0
    static public int sum(int n){

        if(n == 0) return n;// base case

        return n + sum(n-1);// recursive case

    }


    public static void main(String[] args){
        System.out.println(sum(3));
    }
}
