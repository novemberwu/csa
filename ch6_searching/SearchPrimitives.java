package ch6_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SearchPrimitives {

    public static void main(String[] args){
        int[] intArray = {1, 9, 3, 4, 7};

        List<Integer> intList = Arrays.stream(intArray) // Creates an IntStream
                .boxed()          // Boxes int primitives to Integer objects
                .collect(Collectors.toList()); // Collects elements into a List

        System.out.println(intList);


        intList.sort(new IntegerDescComparator());
        System.out.println(intList);




    }
}
