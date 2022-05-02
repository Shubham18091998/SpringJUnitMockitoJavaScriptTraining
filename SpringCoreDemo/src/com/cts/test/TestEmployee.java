package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.Employee;

public class TestEmployee {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Employee emp1=context.getBean("emp1",Employee.class);
		System.out.println(emp1);
		Employee emp2=context.getBean("emp2",Employee.class);
		System.out.println(emp2);

	}

}
