package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.Mobile;
import com.cts.configuration.MobileBeanConfig;

public class TestMobile {
	
	public static void main(String args[]) {
		
		//ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		ApplicationContext context=new AnnotationConfigApplicationContext(MobileBeanConfig.class);
		Mobile mobile1=context.getBean("mobile1",Mobile.class);
		Mobile mobile2=context.getBean("mobile2",Mobile.class);
		mobile1.makeCall();
		mobile1.useData();
		mobile2.makeCall();
		mobile2.useData();
	}

}
