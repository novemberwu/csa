package ch1_13;

public class ProductReview {
    private int rating;
    private String comment;
    private int productId;
    private String author;
    private String[] images;
    private String[] videos;

    public ProductReview(String author, int rating , int productId){
        this.author = author;
        this.rating = rating;
        this.productId = productId;
    }
    public ProductReview(String author, int rating , int productId, String comment){
        this.author = author;
        this.rating = rating;
        this.productId = productId;
        this.comment = comment;
    }
    public static void main(String[]args){
        ProductReview pr = new ProductReview("Monica", 5, 222);
    }


}
