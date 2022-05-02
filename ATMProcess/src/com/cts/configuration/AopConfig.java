package com.cts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.cts.aspect.LoginAspect;
import com.cts.model.EasyBank;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.cts.model")
public class AopConfig {
	
	@Bean
	public EasyBank easyBank() {
		return new EasyBank();
	}
	
	@Bean
	public LoginAspect loginAspect() {
		return new LoginAspect();
	}
}
