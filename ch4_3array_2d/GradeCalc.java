package ch4_3array_2d;

public class GradeCalc{
    public static void gradeCalc(int[][] grades){
        // print the class number, print the average grade of the class
        double maxAverage = -1;
        int maxClass = -1;
        for (int i = 0; i < grades.length; i++) {
            double classSum = 0;
            for (int j = 0; j < grades[i].length; j++) {
                classSum += grades[i][j];
            }
            classSum /= grades[i].length;
            System.out.printf("\nClass: %d  average grade %.2f", i, classSum);
            if( classSum > maxAverage){
                maxClass = i;
                maxAverage = classSum;
            }

        }

        System.out.printf("\n\n **** Class %d has highest average grade %.2f", maxClass, maxAverage);


    }
    public static void main(String[] args){
        int[][] grades = new int[4][];
        grades[0] = new int[]{99, 98, 40, 88, 79, 90}; // grades from class one
        grades[1] = new int[]{66, 68, 77, 99, 100, 83}; // grades from class two
        grades[2] = new int[]{36, 68, 77, 99, 100, 83};
        grades[3] = new int[]{96, 98, 77, 99, 10, 22, 66};

        gradeCalc(grades);
    }
}