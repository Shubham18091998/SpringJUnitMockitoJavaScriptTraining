package com.cts.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cts.beans.Airtel;
import com.cts.beans.Mobile;
import com.cts.beans.Sim;
import com.cts.beans.Vi;

@Configuration
public class MobileBeanConfig {

	@Bean
	public Mobile mobile1(){
		return new Mobile("9919999017",viCard());
	}
	@Bean
	public Sim viCard() {
		return new Vi();
	}
	@Bean
	public Mobile mobile2(){
		return new Mobile("7860190713",airtelCard());
	}
	@Bean
	public Sim airtelCard() {
		return new Airtel();
	}
}
