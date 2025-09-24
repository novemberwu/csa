package ch1_4;

public class InputExamples {

    public static void printArguments(String[] args){
        for(String arg: args){
            System.out.println("arguments: "+ arg);
        }
    }

    public static void main(String[] args){
       printArguments(args);

    }
}
