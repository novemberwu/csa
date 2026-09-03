package ch7_sorting;

public class HiddenWord {
    public static void main(String[] args) {
        String[] a = "ABCD".split("");
        String[] b = "ABCD".split("");
        for(int i = 0 ; i < a.length; i++){
            System.out.println(a[i] == b[i]);
        }
    }
}
