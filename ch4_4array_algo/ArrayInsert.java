package ch4_4array_algo;

import java.util.Arrays;

public class ArrayInsert {

    public static void insertion(int[] array, int newItem, int lastIndex){


    }

    public static int findPos(int[] array , int target){
        int i =0;
        for(; i < array.length; i++){
            if(array[i]> target)
               break;
        }

        return i;
    }


    public static void insert(int[] array, int newItem, int pos, int lastIndex){
        if(lastIndex == array.length-1) throw new IllegalArgumentException("Array is full");

        int i = lastIndex + 1;
        while(i > pos){
            array[i] = array[i-1];
            i--;
        }
        array[i] = newItem;
    }

    public static void main(String[] args){
        int[] array = {1, 1, 2, 3, 8, 13, -1, -1};
        System.out.println();
        Arrays.stream(array).forEach(t -> System.out.print(t + " "));
        insertion(array, 0,5);
        System.out.println();

        Arrays.stream(array).forEach(t -> System.out.print(t + " "));

    }
}
