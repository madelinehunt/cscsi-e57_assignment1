package cscie57.assignment1_2;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cscie57.assignment1_2.Book;

@Component("category")
@Lazy
public class Category {
    private static final Logger logger = LoggerFactory.getLogger(Category.class);
    
    private Long id; 
    private String name; 
    private Book book;
    
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-1_2.xml");
        ctx.refresh();  

        Category instance = (Category) ctx.getBean("category");
        instance.displayInfo();

        ctx.close();
    }

    public void displayInfo() {
        logger.info("======================bookAutowiredBySetter Output Start ======================");
        logger.info("Autowiring " + this.name + ": book = " + this.book.toString());
        logger.info("======================bookAutowiredBySetter Output End ======================");
    }
    
    @Autowired
    @Qualifier("bookWhitman")
    public void setBook(Book book) {
        this.book = book;
    }

}
