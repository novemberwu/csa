package ch3_1;

public class StopwatchClient {
    private static Integer[] genArray(int n){
        Integer[] a = new Integer[n];
        for(int i = a.length-1; i >=0 ; i--){
            a[a.length -1 -i] = i;
        }
        return a;
    }

    public static void main(String[] args){

        int N = 100000;

        Integer[] a = genArray(N);

        Stopwatch timer1 = new Stopwatch();
        Insertion.sort(a);
        System.out.printf("\ninsertion sort : %.3f", timer1.elapsedTime());

        Integer[] b = genArray(N);

        timer1.reset();
        ShellSort.shellSort(b);
        System.out.printf("\nshell sort: %.3f", timer1.elapsedTime());


    }
}
