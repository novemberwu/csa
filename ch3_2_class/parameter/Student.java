package ch3_2_class.parameter;

public class Student {

    private String name;
    private Course newCourse;

    public Student(String name, Course newCourse) {
        this.name = name;
        this.newCourse = newCourse;
    }

    public void dropCourse(Course theCourse) {
        theCourse.setStatus(false);
    }

    public String toString() {
        return name + "\n" + newCourse;
    }

}
