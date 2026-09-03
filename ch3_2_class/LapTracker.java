package ch3_2_class;

public class LapTracker {
    //instance variables
    private int threshold;
    private int currentCount;
    private int laps;
    //constructors
    public LapTracker(int threshold){
        this.threshold = threshold;
        this.currentCount = 0;
        this.laps = 0;
    }

    public int addLaps(int laps){
        this.laps += laps;
        this.currentCount ++;
        if(currentCount >= this.threshold){
            this.laps = 0;
            this.currentCount = 0;
        }
        return laps;

    }
    //methods
}
