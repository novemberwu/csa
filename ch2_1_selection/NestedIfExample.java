package ch2_1_selection;

public class NestedIfExample {


    public static void printGrade(double grade){

        if(grade >=90){
            System.out.println("A");
        }else if(grade >=80){
            System.out.println("B");
        }else if (grade >= 70){
            System.out.println("C");
        }else if (grade >= 60){
            System.out.println("D");
        }else{
            System.out.println("F");
        }

    }

    public static void printGrade2(double grade){
        if(grade >=90){
            System.out.println("A");
        }

        if(grade >=80){
            System.out.println("B");
        }

        if (grade >= 70){
            System.out.println("C");
        }

        if (grade >= 60){
            System.out.println("D");
        }

        else{
            System.out.println("F");
        }
    }


    public static void main(String[] args){
        double grade = Double.parseDouble(args[0]);
        printGrade(grade);

        System.out.println("------");

        printGrade2(grade);


    }
}
