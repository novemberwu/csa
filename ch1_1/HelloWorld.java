package ch1_1;

public class HelloWorld {

    //Print greeting messages to the names that are entered in stdIn
    public static void main(String[] args){
        //System.out.println("Hello World");

        //example for runtime error
        System.out.println("Hello  " + args[0] + " and " +args[1] );
    }

    // terminal command to run
    // javac HelloWorld.java
    // java -classpath /Users/wuyuan/src/csa/ ch1_1.HelloWorld
}
