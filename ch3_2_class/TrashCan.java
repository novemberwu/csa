package ch3_2_class;

public class TrashCan {
    private double capacity; // available space
    private double residual; // trash already in the can

    public TrashCan(double cap){
        this.capacity = cap;
    }

    public double acceptTrash(double newTrash){
        residual += newTrash;

        if(residual > capacity){
            residual -= capacity;
        }

        return capacity - residual;
    }

    public static void main(String[] args){
        TrashCan trashCan = new TrashCan( 10.0);

        System.out.println(trashCan.acceptTrash(2.5));
        System.out.println(trashCan.acceptTrash(8));

    }







}
