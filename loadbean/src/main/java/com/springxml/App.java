package com.springxml;

import com.springxml.domain.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");

        Hello hello = (Hello) ctx.getBean("hello");
        hello.hello();
    }
}
