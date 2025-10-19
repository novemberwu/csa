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
    public String getColor(){return color;}


    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\ncolor:").append(color);
        sb.append("\nyear: ").append(year);
        sb.append("\nmake: ").append(make);
        sb.append("\nmodel:").append(model);
        return sb.toString();
    }

    public static void main(String[] args){
        Car c = new Car("Yellow", 2025, "Tesla", "Model Y");
        System.out.println(c.getColor());


        System.out.println(c);
    }
}
