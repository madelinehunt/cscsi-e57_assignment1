package cscie57.assignment1_3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;
import org.springframework.aop.framework.ProxyFactory;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cscie57.assignment1_3.Book;

@Component("bookThrowsAdvice")
@Lazy
public class BookThrowsAdvice implements ThrowsAdvice {
    private static final Logger logger = LoggerFactory.getLogger(BookThrowsAdvice.class);
    private Book book;

    public static void main(String... args) throws Exception {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-1_3.xml");
        ctx.refresh();  

        BookThrowsAdvice instance = (BookThrowsAdvice) ctx.getBean("bookThrowsAdvice");
        
        ProxyFactory pf = new ProxyFactory();
        pf.setTarget(instance.book);
        pf.addAdvice(new BookThrowsAdvice());
        
        Book proxy = (Book) pf.getProxy();
        
        try {
            proxy.throwException();
        } catch(Exception ignored) {

        }

        ctx.close();
    }
    
    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }
    
    public void afterThrowing(Exception ex) throws Throwable {
        logger.info("***");
        logger.info("RuntimeException Captured");
        logger.info("Caught: " + ex.getClass().getName());
        logger.info("Method: throwException");
    }
    
    public void afterThrowing(Method method, Object args, Object target, IllegalArgumentException ex) throws Throwable {
        logger.info("***");
        logger.info("RuntimeException Captured");
        logger.info("Caught: " + ex.getClass().getName());
        logger.info("Method: " + method.getName());
    }


}
