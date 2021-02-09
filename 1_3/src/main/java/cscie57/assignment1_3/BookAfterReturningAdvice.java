package cscie57.assignment1_3;

import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.framework.ProxyFactory;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import cscie57.assignment1_3.Book;

@Component("bookAfterReturningAdvice")
@Lazy
public class BookAfterReturningAdvice implements AfterReturningAdvice {
    private static final Logger logger = LoggerFactory.getLogger(BookAfterReturningAdvice.class);
    private Book book;

    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-1_3.xml");
        ctx.refresh();  

        BookAfterReturningAdvice instance = (BookAfterReturningAdvice) ctx.getBean("bookAfterReturningAdvice");
        
        ProxyFactory pf = new ProxyFactory();
        pf.addAdvice(new BookAfterReturningAdvice());
        pf.setTarget(instance.book);
        
        Book proxy = (Book) pf.getProxy();
        proxy.reading();

        ctx.close();
    }
    
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        logger.info("After 'reading' write the book review.");
    }
    
    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

}
