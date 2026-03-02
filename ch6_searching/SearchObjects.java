package ch6_searching;

import java.util.ArrayList;
import java.util.List;

public class SearchObjects {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add( new Book("Harry Potter and the Half-Blood Prince (Harry Potter  #6)", "9780439785969", "J.K. Rowling"));
        list.add( new Book("System design interview", "0001", "Rachel Wu"));


        System.out.println("Containing 0001 "+ list.contains(new Book("System design interview", "0001", "Rachel Wu")));
    }
}
