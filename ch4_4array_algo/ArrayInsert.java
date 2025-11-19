package ch4_4array_algo;

import java.util.Arrays;

public class ArrayInsert {

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

        Arrays.stream(array).forEach(t -> System.out.print(t + " "));
        int index = findPos(array, 5);
        System.out.println("\ninsert position:" + index);
        insert(array,5, index,  5);
        Arrays.stream(array).forEach(t -> System.out.print(t + " "));

    }
}
