package ch1_13;

public class Student {
    private String id;
    private String name;

    public  Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    //Override toString method , so that I can customize the string representation of the Student class
    public String toString(){
        return id + ":" + name;
        //1:Rachel

    }

    public static void main(String[] args){
        Student s = new Student("1", "Rachel");
        System.out.println(s);
    }
}
