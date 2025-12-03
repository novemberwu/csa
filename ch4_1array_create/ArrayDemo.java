package ch4_1array_create;

public class ArrayDemo {

    public static void main(String[] args){
        double[] array = new double[10];

        double result = 1;

        for(int i  = 0 ; i < 10 ; i++){
            array[i] = Math.random();
        }

        for(int i = 0; i < 10; i++){
            if(array[i] < result){
                result = array[i];
            }
        }
        System.out.println(result);
    }
}
