package ch5_1_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListModificationDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(42);
        numList.add(66);
        numList.add(71);
        numList.add(12);
        numList.add(39);

        System.out.println("Original list: " + numList + "\nSize: " + numList.size());

        numList.removeIf(t -> t == 42);

        System.out.println("New list: " + numList + "\nSize: " + numList.size());

    }
}
