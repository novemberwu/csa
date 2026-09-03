package review;

public class IntPair {
    private int firstValue;
    private int secondValue;

    public IntPair(int first, int second){
        this.firstValue = first;
        this.secondValue = second;
    }

    public int getFirst(){
        return this.firstValue;
    }
    public void setFirst(int firstValue){
        this.firstValue =- firstValue;
    }
    public int getSecond(){
        return this.secondValue;
    }

    public void setSecond (int secondValue){
        this.secondValue = secondValue;
    }

}
