package ch4_3array_2d;

public class StudentCourses {
    public static void main(String[] args){

        String[][] courses ={
                {"Rachel","Computer Science A","Computer Science Principle"},
                // adding more students here
                {"Ruiqi", "AP Physics", "CSA", "Calculus"},
                {"Xiaobing", "CSA","Pre-Chemistry" }
        };

        String student = "Ruiqi";
        int courseNum = getCourseNumber(courses, student);
        System.out.println(courseNum);

    }


    private static int getCourseNumber(String[][] courses, String studentName){
        // Your implementation here
        for(int i = 0 ; i < courses.length;i++){
            String[] stu = courses[i];
            if(stu[0].equals(studentName)){
                return stu.length -1;
            }
        }
        return -1;
    }
}
