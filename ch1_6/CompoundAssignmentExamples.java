package ch1_6;

public class CompoundAssignmentExamples {
    public static void main(String[] args){
        int score = 0;
        System.out.println(score);
        score++;
        System.out.println(score);
        score *= 2;
        System.out.println(score);
        int penalty = 5;
        score -= penalty / 2;
        System.out.println(score);
    }
}
