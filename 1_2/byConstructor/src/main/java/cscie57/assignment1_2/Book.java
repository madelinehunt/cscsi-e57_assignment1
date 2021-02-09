package cscie57.assignment1_2;

import org.springframework.context.support.GenericXmlApplicationContext;

// import org.springframework.stereotype.Service;
// 
// @Service("book")
public class Book {
    private Long id; 
    private String isbn; 
    private String title; 
    private Float price;
    
    public Book(Long id, String isbn, String title, Float price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    @Override 
    public String toString() {
        return "Book - Id: " + this.id + ", ISBN: " + this.isbn + ", Title: " + this.title + ", Price: " + this.price;
    }
}
