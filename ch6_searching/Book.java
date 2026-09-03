package ch6_searching;

public class Book implements Comparable<Book> {
    private String name;
    private String isbn;
    private String author;

    public Book(String name, String isbn, String author){
        this.name = name;
        this.isbn = isbn;
        this.author = author;
    }

    @Override
    public boolean equals(Object other){
        if(other == null) return false;
        if(other == this) return true;
        if( other instanceof  Book){
            Book o = (Book)other;
            return o.isbn.equals(this.isbn);
        }else{
            return false;
        }

    }

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Book o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString(){
        return this.name;
    }
}
