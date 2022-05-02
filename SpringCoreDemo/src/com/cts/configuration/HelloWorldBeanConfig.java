package com.cts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.beans.HelloWorld;

@Configuration
public class HelloWorldBeanConfig {

	@Bean
	public HelloWorld helloWorld() {
		return new HelloWorld();
	}
	@Bean
	public HelloWorld hiWorld() {
		return new HelloWorld();
	}
}
