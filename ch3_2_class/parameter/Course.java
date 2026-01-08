package ch3_2_class.parameter;

public class Course {

    private String name;
    private boolean status;

    public Course(String name, boolean status) {
        this.name = name;
        this.status = status;
    }

    public void setStatus(boolean newStatus) {
        this.status = newStatus;
    }

    public String toString() {
        String text = name + ": ";

        if (status) {
            text = text + "Enrolled";
        }
        else {
            text = text + "Dropped";
        }

        return text;
    }

}