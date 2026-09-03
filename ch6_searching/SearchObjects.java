package ch6_searching;

import java.util.ArrayList;
import java.util.List;

public class SearchObjects {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        list.add( new Book("Harry Potter and the Half-Blood Prince (Harry Potter  #6)", "9780439785969", "J.K. Rowling"));
        list.add( new Book("System design interview", "0001", "Rachel Wu"));

        list.add(new Book("Linear Algebra", "0002", "Someone"));

        System.out.println(list);

       // System.out.println("Containing 0001 "+ list.contains(new Book("System design interview", "0001", "Rachel Wu")));

        list.sort(new BookComparator());

        System.out.println(list);
    }
}
