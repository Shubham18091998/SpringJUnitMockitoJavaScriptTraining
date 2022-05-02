package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.beans.HelloWorld;
import com.cts.configuration.HelloWorldBeanConfig;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext(HelloWorldBeanConfig.class);
		HelloWorld helloBean=context.getBean("helloWorld",HelloWorld.class);
		helloBean.setMessage("Hello World");
		System.out.println(helloBean.getMessage());
		HelloWorld hiBean=context.getBean("hiWorld",HelloWorld.class);
		hiBean.setMessage("Hi World");
		System.out.println(hiBean.getMessage());

	}

}
