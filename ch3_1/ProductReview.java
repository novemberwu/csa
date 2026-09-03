package ch3_1;

public class ProductReview {
    private final int rating;
    private String text;
    private final String authorId;
    private final String productId;
    private  String[] images;

    public int getRating(){
        return this.rating;
    }

    public void setText(String t){
        this.text = t;

    }

    public String getText(){
        return this.text;
    }

    private final static int IMAGE_SIZE = 10;

    public ProductReview(int rating, String authorId, String pid){
        this.rating = rating;
        this.authorId = authorId;
        this.productId = pid;

    }

    public ProductReview(){
        this.rating = 5;
        this.authorId = "anonumous";
        this.productId = "default value";
    }


}
