package ch1_9;

public class MathExample {
    public static void main(String[] args){
        if(args.length != 2){
            return;
        }

        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        double val = b * b - 4 * c;
        double root = Math.sqrt(val);

        double result1 = (-b + root) / 2.0;
        double result2 = (-b - root) / 2.0;

        System.out.println("The root 1 is : "+ result1);
        System.out.println("The root 2 is : "+ result2);
    }
}
