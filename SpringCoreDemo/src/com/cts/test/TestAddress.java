package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.beans.Address;

public class TestAddress {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Address address1=context.getBean("address1",Address.class); //Setter injection
		System.out.println(address1);
		Address address2=context.getBean("address2",Address.class); //Constructor injection
		System.out.println(address2);

	}

}
