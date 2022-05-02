package com.cts.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.apppackage.MemberShip;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		MemberShip member1=context.getBean("membershipObj",MemberShip.class);
		System.out.println(member1);

	}

}
