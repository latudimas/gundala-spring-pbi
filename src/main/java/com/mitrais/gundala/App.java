package com.mitrais.gundala;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("appContext.xml");
        Book bookBean = ctx.getBean("bookBean", Book.class);
        bookBean.setId(222);
        System.out.println(bookBean);
        Book bookBean2 = ctx.getBean("bookBean2", Book.class);
        System.out.println(bookBean2);
    }
}
