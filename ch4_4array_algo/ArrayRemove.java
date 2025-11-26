package ch4_4array_algo;

import java.util.Arrays;

public class ArrayRemove {
    //array is already sorted
    // deletedItem is the to be deleted item
    // lastIndex is the index of the last existing element
    // return is the original index of the deleted Item
    public static int remove(int[] array, int deletedItem, int lastIndex){
        int i ;
        for( i = 0 ; i <= lastIndex; i++){
            if( array[i] == deletedItem) {
                break;
            }
        }
        //i is already the postion, where the element here equals the deleteItem
        for(int j = i; j < lastIndex; j++){
            array[j] = array[j+1];
        }

        return i;

    }


    public static void main(String[] args){
        int[] array = {1, 1, 2, 3, 8, -1, -1};

        Arrays.stream(array).forEach(System.out::println);

        int index = remove(array, 1, 4);

        System.out.print("\n\ndelete item pos:" +index);

        System.out.println();

        Arrays.stream(array).forEach(System.out::println);

    }
}
