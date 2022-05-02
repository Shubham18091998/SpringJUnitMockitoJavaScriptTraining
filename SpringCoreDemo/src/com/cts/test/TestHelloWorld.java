package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.HelloWorld;

public class TestHelloWorld {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld bean1 =(HelloWorld)context.getBean("helloWorld");
		bean1.setMessage("Hello World");
		System.out.println(bean1.getMessage());
		
		HelloWorld bean2 =(HelloWorld)context.getBean("helloWorld");
		bean2.setMessage("Hi World");
		System.out.println(bean2.getMessage());
		
	}

}
