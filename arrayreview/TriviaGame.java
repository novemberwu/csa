package arrayreview;

public class TriviaGame {

    private TriviaQuestion[] allQuestions;


    public TriviaGame(TriviaQuestion[] allQuestions){
        this.allQuestions = allQuestions;
    }

    public String getRating(){
        double adjustedAverage  = 0.0;
        double sum = 0.0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(TriviaQuestion question: allQuestions){
            if(question.getDifficultLevel() < min){
                min = question.getDifficultLevel();
            }
            if(question.getDifficultLevel() > max){
                max = question.getDifficultLevel();
            }
            sum += question.getDifficultLevel();
        }

        sum -= min;
        sum -= max;
        adjustedAverage = sum/(allQuestions.length -2);
        String rating ;
        if(adjustedAverage >= 70.0){
            rating = "Expert";
        }else if(adjustedAverage >= 50.0){
            rating = "Intermediate";
        }else{
            rating = "Beginner";
        }
        return rating;
    }

    // if games difficulty level is less or equal to the ones following it
    public boolean isDifficultyIncreasing(){
        int prev = Integer.MIN_VALUE;
        for(TriviaQuestion triaviaQuestion : allQuestions){
            if(triaviaQuestion.getDifficultLevel() < prev)
                return false;
            else
                prev = triaviaQuestion.getDifficultLevel();
        }

        return true;
    }
    // if games difficulty level is greater or equal to the ones following it

    public boolean isDifficultyDecreasing(){
        return false;
    }
    // if games difficulty level are all the same

    public boolean isDifficultyAllTheSame(){
        return false;
    }

    public static void main(String[] args) {
        TriviaGame g = new TriviaGame(new TriviaQuestion[]{new TriviaQuestion(1), new TriviaQuestion(2), new TriviaQuestion(2)});
        System.out.println(g.isDifficultyIncreasing());

        TriviaGame z = new TriviaGame(new TriviaQuestion[]{new TriviaQuestion(3), new TriviaQuestion(2), new TriviaQuestion(2)});
        System.out.println(z.isDifficultyIncreasing());



    }
}
