package com.cts.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LoggingAspect {
	
	@Before("allGettersInModel()")
	public void loggingAdvice_1() {
		System.out.println("Advice_1");
	}
	
	@Before("allGettersInModel()")
	public void loggingAdvice_2() {
		System.out.println("Advice_2");
	}
}
