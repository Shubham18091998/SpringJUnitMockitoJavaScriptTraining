package com.cts.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBook {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("bookbean.xml");
		Book book1=context.getBean("javaBook",Book.class);
		System.out.println(book1);

	}

}
