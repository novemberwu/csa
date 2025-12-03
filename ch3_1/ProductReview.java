package ch3_1;

public class ProductReview {
    private final int rating;
    private String text;
    private final String authorId;
    private final String productId;
    private  String[] images;

    private final static int IMAGE_SIZE = 10;

    public ProductReview(int rating, String authorId, String productId){
        this.rating = rating;
        this.authorId = authorId;
        this.productId = productId;

        this.images = new String[IMAGE_SIZE];
    }

    public ProductReview(int rating, String authorId, String productId, String text){
        this.rating = rating;
        this.authorId = authorId;
        this.productId = productId;
        this.text = text;

    }

    public int getRating(){
        return this.rating;
    }

    public String getText(){
        return text;
    }
    public void setText(String newText){
        text = newText;
    }


    public static void main(String[] args){
        ProductReview r = new ProductReview(3, "rachel", "111");
        System.out.println(r.rating);
    }
}
