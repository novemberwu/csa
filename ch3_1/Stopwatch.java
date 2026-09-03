package ch3_1;

public class Stopwatch {

    private final long startTime ;

    public Stopwatch(){
        // implementation here
        startTime = System.currentTimeMillis();
    }


    public double elapsedTime(){
        // implementation here
        long endTime = System.currentTimeMillis();
       return endTime - startTime;
    }


}
