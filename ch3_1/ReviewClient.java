package ch3_1;

import java.util.UUID;

public class ReviewClient {
    public static void main(String[] args){

        ProductReview pr = new ProductReview(4, "rachel", UUID.randomUUID().toString());

        System.out.println(pr.getRating());
        System.out.println(pr.getText());// expect get blank text;

        pr.setText("This is a good product");

        System.out.println(pr.getText());// will produce product review with the comments

        ProductReview pr1 = new ProductReview(5, "Rachel", "111", "Great");

    }
}
