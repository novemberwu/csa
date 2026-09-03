package ch3_2_class.parameter;

public class StudentRunner {
    public static void main(String[] args) {

        boolean isEnrolled = true;

        Course csCourse = new Course("Computer Science", isEnrolled);
        Student betsy = new Student("Betsy", csCourse);

        System.out.println(betsy);

        csCourse.setStatus(isEnrolled);
        System.out.println("IsEnrolled:"+ isEnrolled);

        /* ---- 🔎 ADD YOUR CODE BELOW THIS LINE ---- */
        betsy.dropCourse(csCourse);
        System.out.println(csCourse);


    }
}
