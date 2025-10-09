package ch1_11;

public class MathAPIExample {
    public static void main(String[] args){
        if(args.length < 2){
            System.out.println("Please enter 2 numbers");
        }

        System.out.println("start");

        // Parse coefficients from command line
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);

        // Calculate roots of x*x + b*x + c
        double discriminant = b * b - 4.0 * c;
        double d = Math.sqrt(discriminant);
        double root1 = (-b + d ) / 2.0;
        double root2 = (-b - d) / 2.0;

        //print them out
        System.out.println(root1);
        System.out.println(root2);

    }
}
