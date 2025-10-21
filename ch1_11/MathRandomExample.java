package ch1_11;

public class MathRandomExample {

    // get random number in range [start, end)
    static public double getRandomInt(int start, int end){
        double range = end - start;
        return start + range * Math.random();

    }
    public static void main(String[] args){

        for(int i = 0;i < 10; i++){
            System.out.println(getRandomInt(2, 8));
        }

        // Math.random will return a random number in range [0, 1)

    }
}
