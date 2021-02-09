package cscie57.assignment1_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Book {
    private static final Logger logger = LoggerFactory.getLogger(Book.class);
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
        return "Book - : " + this.id + ", ISBN: " + this.isbn + ", Title: " + this.title + ", Price: " + this.price;
    }
    
    public void reading() {
        logger.info("Reading " + title + " book");
    }
    
    public void throwException() {
        throw new RuntimeException("Book Bean Exception");
    }
}
