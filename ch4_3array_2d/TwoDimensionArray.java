package ch4_3array_2d;

public class TwoDimensionArray {
    public static void main(String[] args){
        int[][] array =  new int[5][7];

        for(int i = 0 ; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = i * 10  + j;
            }
        }

        for(int i = 0 ; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
               System.out.printf("%2d ", array[i][j]);
            }
            System.out.println();
        }




    }
}
