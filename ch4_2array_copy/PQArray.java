package ch4_2array_copy;

public class PQArray {
    public static void main(String[] args){
        int[] a = new int[6];
        int[] b = new int[a.length];

        //b = a;
        a = b;
        for(int i =0; i < b.length; i++){
            b[i] = i;
        }

        // what will be values in array a?
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();


        // what will be values in array b?
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }
}
