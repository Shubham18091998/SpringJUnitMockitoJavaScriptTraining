package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.apppackage.BangalorePassportOffice;
import com.spring.apppackage.ChennaiPassportOffice;
import com.spring.apppackage.Document;
import com.spring.apppackage.HeadPassportOffice;
import com.spring.configuration.AppConfig;

public class ApplicationPassport {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Select location: ");
		System.out.println("1.Cheenai");
		System.out.println("2.Bangalore");
		int choice=sc.nextInt();
		ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		HeadPassportOffice passport=null;
		if(choice==1) {
			passport=context.getBean("chennaiPassportOffice",ChennaiPassportOffice.class);
			passport.doPhotoVerification();
			passport.issuePassport();
		}
		else {
			passport=context.getBean("bangalorePassportOffice",BangalorePassportOffice.class);
			passport.doPhotoVerification();
			passport.issuePassport();
		}

	}

}
