package ch3_2_class;

public class CubePair {
    //instance variables
    private Cube c1;
    private Cube c2;
    //constructors
    public CubePair(String s, String t){
        c1 = new Cube(s);
        c2 = new Cube(t);
    }

    public CubePair(String s){
        c1 = new Cube(s);
        c2 = new Cube(s);

    }
    //methods

    public String rollCubes(){
        return c1.roll() + c2.roll();
    }
}
