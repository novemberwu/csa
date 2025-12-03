package ch5_1_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListModification {


    // Safe removal during iteration
    private static void arrayListCorrectExample(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "B","C", "D"));
        System.out.println("Original list: " + list);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.equals("B")) {
                iterator.remove(); // Safe removal during iteration
            }
        }
        System.out.println("List after attempted modification: " + list);
    }

    // DO NOT DO THIS IN PRODUCTION
    private static void arrayListPitfallExample2(){
        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "B","C", "D"));
        System.out.println("Original list: " + list);

        for(int i =0; i < list.size(); i++){
            if(list.get(i).equals("B"))
                list.remove(i);
        }
        System.out.println("List after attempted modification: " + list);
    }

    // DO NOT DO THIS IN PRODUCTION
    private static void arrayListPitfallExample1(){
        List<String> names = new ArrayList<>(Arrays.asList("A", "B", "C", "D"));
        System.out.println("Original list: " + names);

        for (String name : names) {
            if (name.equals("B")) {
                names.remove(name); // This will cause ConcurrentModificationException
            }
        }
        System.out.println("List after attempted modification: " + names);
    }
    public static void main(String[] args){
        arrayListPitfallExample1();

    }

}
