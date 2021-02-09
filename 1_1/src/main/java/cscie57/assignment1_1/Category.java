package cscie57.assignment1_1;

import java.util.Set;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.context.support.GenericXmlApplicationContext;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cscie57.assignment1_1.Book;

public class Category {
    private static final Logger logger = LoggerFactory.getLogger(Category.class);
    
    private Long id; 
    private String name; 
    private Set<Book> booksSet;
    private List<Book> booksList; 
    private Map<String, Book> booksMap;
    
    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-1_1.xml");
        ctx.refresh();  

        Category instance2 = (Category) ctx.getBean("category2");
        instance2.displayInfo();
        Category instance3 = (Category) ctx.getBean("category3");
        instance3.displayInfo();
        Category instance4 = (Category) ctx.getBean("category4");
        instance4.displayInfo();

        ctx.close();
    }

    public void displayInfo() {
        
        if (!Objects.isNull(this.booksSet)) {
            logger.info("======================Books Set Output Start ======================");
            logger.info( "Category -- Id: " + this.id + " Name: " + this.name + ", Books Set: " + booksSet.toString() );
            // booksSet.forEach(obj -> logger.info("Value: " + obj));
            logger.info("======================Books Set Output End ======================");
        } else if (!Objects.isNull(this.booksList)) {
            logger.info("======================Books Set Output Start ======================");
            logger.info( "Category -- Id: " + this.id + " Name: " + this.name + ", Books List: " + booksList.toString() );
            // booksSet.forEach(obj -> logger.info("Value: " + obj));
            logger.info("======================Books Set Output End ======================");
        } else if (!Objects.isNull(this.booksMap)) {
            logger.info("======================Books Set Output Start ======================");
            logger.info( "Category -- Id: " + this.id + " Name: " + this.name + ", Books Map: " + booksMap.toString() );
            // booksSet.forEach(obj -> logger.info("Value: " + obj));
            logger.info("======================Books Set Output End ======================");
        }
    }
    
    public void setBooksSet(Set<Book> booksSet) {
        this.booksSet = booksSet;
    }

    public void setBooksList(List<Book> booksList) {
        this.booksList = booksList;
    }

    public void setBooksMap(Map<String, Book> booksMap) {
        this.booksMap = booksMap;
    }

}
