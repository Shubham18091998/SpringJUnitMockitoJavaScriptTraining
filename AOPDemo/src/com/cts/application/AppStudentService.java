package com.cts.application;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.model.Student;
import com.cts.service.StudentService;

public class AppStudentService {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService studentService=context.getBean("studentService",StudentService.class);
		Student student=studentService.getStudent();
		int rollno=student.getRollno();
		String name=student.getName();
		System.out.println(rollno+" "+name);

	}

}
