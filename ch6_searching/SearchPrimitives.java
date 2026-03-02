package ch6_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchPrimitives {

    public static void main(String[] args){
        int[] intArray = {1, 2, 3, 4, 5};

        List<Integer> intList = Arrays.stream(intArray) // Creates an IntStream
                .boxed()          // Boxes int primitives to Integer objects
                .collect(Collectors.toList()); // Collects elements into a List

        System.out.println("Containing 3? " + intList.contains(3));
        System.out.println("Containing 10? " + intList.contains(10));
    }
}
