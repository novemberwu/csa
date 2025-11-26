package ch3_1;

import java.util.UUID;

public class ReviewClient {
    public static void main(String[] args){
        ProductReview pr = new ProductReview(4, "rachel", UUID.randomUUID().toString());

    }
}
