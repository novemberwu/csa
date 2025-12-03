package ch3_1;

public class Stopwatch {

    private long startTime;
    public Stopwatch(){
        // implementation here
        startTime = System.currentTimeMillis();

    }

    public void reset(){
        startTime = System.currentTimeMillis();

    }
    public double elapsedTime(){
        // implementation here
        long current = System.currentTimeMillis();
        return (current - startTime) / 1000.0;
    }


}
