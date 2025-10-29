package ch2_1_selection;

import java.util.Scanner;

public class Course {

    private String teacher;    // The name of the teacher

    /*
     * Sets teacher to the given name of the teacher
     */
    public Course(String teacher) {
        this.teacher = teacher;
    }

    /*
     * Prompts the user to enter grades while the input is not -1
     * and prints the score entered
     */
    public void promptForGrade() {
        Scanner input = new Scanner(System.in);
        int score = 0;

        while (score != -1) {
            System.out.print("Enter the student's score (or -1 to quit): ");
            score = input.nextInt();
            printResult(score);
        }

        input.close();
    }

    /*
     * Prints the score provided by the user
     */
    public void printResult(int enteredScore) {
        if (isValidScore(enteredScore)) {
            System.out.println("Score is: " + enteredScore);
        }
        else {
            if (enteredScore == -1) {
                System.out.println("Goodbye!");
            }
            else {
                System.out.println("The score is invalid. Please try again.");
            }
        }
    }

    /*
     * Returns true if the score is valid, otherwise returns false
     */
    public boolean isValidScore(int score) {
        if (score >= 50 && score <= 100) {
            return true;
        }
        else {
            return false;
        }
    }

}
