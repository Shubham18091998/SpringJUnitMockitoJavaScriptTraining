package com.spring.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.apppackage.Document;

@Configuration
@ComponentScan("com.spring.apppackage")
public class AppConfig {

	@Bean
	public Document chennaiDocument() {
		return new Document("Joe","Driving License","Chennai");
	}
	
	@Bean
	public Document bangaloreDocument() {
		return new Document("John","Aadhar Card","Bangalore");
	}
}
