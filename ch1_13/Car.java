package ch1_13;

public class Car {
    private String color;
    private int year;
    private  String make;
    private String model;

    public Car(String col, int year, String make, String model){
        this.color = col;
        this.year = year;
        this.make = make;
        this.model = model;
    }
    public String getColor(){
        return color;
    }

    public void setColor(String col){
        this.color = col;
    }

    // this will override the toString() method in its parent i.e. Object
    public String toString(){
        return color + " "+ model;
    }

    public static void main(String[] args){
        Car c = new Car("Red", 2025, "Tesla", "Model Y");
        System.out.println(c);
        System.out.println(c.toString());
    }
}
