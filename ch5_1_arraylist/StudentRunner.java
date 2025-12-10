package ch5_1_arraylist;

import java.util.ArrayList;

public class StudentRunner {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rachel"));
        students.add(new Student(2, "Monica"));

        System.out.println( "List:" + students);

        Student s = new Student(3, "Jerry");
        System.out.println("List contain "+ s.getName()+"? " + students.contains(s));

    }

}
