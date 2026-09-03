package ch3_1;

import java.util.UUID;

public class ReviewClient {
    public static void main(String[] args){
        Book book = new Book();




        ProductReview review = new ProductReview(5,"rachelwu","keyboard");
        int r = review.getRating();


        System.out.println(r);

        review.setText("This is great");
        System.out.println(review.getText());





    }
}
