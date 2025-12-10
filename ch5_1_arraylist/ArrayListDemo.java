package ch5_1_arraylist;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void sizeExample(){
        System.out.println("*****Size Example");
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Size "+names.size());

        System.out.println("Is Empty:" + names.isEmpty());

        names.add("Jimmy");

        System.out.println("Size "+names.size());
        System.out.println("Is Empty:" + names.isEmpty());

    }

    public static void addExample(){
        System.out.println("*****Add Example");
        ArrayList<String> names = new ArrayList<>();
        names.add("Amy");
        System.out.println(names);

        names.add(0, "Ben");
        System.out.println(names);

        // adding one name at index 1
    }

    public static void setGetExample() {
        System.out.println("*****Set Get Example");
        ArrayList<String> names = new ArrayList<>();
        names.add("Amy");
        System.out.println(names);
        names.set(0,"Anna");
        System.out.println(names);

        System.out.println(names.get(0));
    }

    public static void removeExample(){
        System.out.println("*****Remove Example");
        ArrayList<String> names = new ArrayList<>();
        names.add("Amy");
        System.out.println(names);

        names.remove("Amy");

        System.out.println(names);

        names.add("Rachel"); //0
        names.add("Monica");//1
        names.add("Ross");//2
        names.add("Chandler");//3
        System.out.println(names);
        names.remove(2);
        System.out.println(names);

    }

    public static void containsExample(){
        System.out.println("*****Remove Example");
        ArrayList<String> names = new ArrayList<>();
        names.add("Rachel"); //0
        names.add("Monica");//1
        names.add("Ross");//2
        names.add("Chandler");//3

        System.out.println("Contains Phoebe? "+ names.contains("Phoebe"));

        System.out.println("Index of Monica:" + names.indexOf("Monica"));
    }

    public static void main(String[] args) {
        addExample();
        sizeExample();
        setGetExample();
        removeExample();
        containsExample();
    }
}
