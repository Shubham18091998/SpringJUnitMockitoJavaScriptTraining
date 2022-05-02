package com.cts.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cts.model.EasyBank;

@Component
@Aspect
public class LoginAspect {

	@Autowired
	private EasyBank easyBank;
	
	@Around("execution(public * com.cts.model.*.doWithdraw(..))")
	public void validateWithdraw(ProceedingJoinPoint joinPoint) throws Throwable{
		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new Exception();
		} else {
			joinPoint.proceed();
			System.out.println("Your remaining balance is " + (easyBank.getBalance()));

		}
	}
	
	@Before("execution(public * com.cts.model.*.showBalance())")
	public void validateBalance_1() throws Exception{
		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new RuntimeException();
		}
	}
	
	@Before("execution(public * com.cts.model.*.doDeposit(..))")
	public void validateBalance_2() throws Exception{
		if (easyBank.getTempPin() != easyBank.getPinCode()) {
			throw new RuntimeException();
		}
	}
	
	
	@AfterReturning(pointcut="execution(public * com.cts.model.*.doChangePin(..))")
	public void afterPinChange() {
		System.out.println("You have successfully changed your pin");
	}
	
	@AfterThrowing(pointcut="execution(public * com.cts.model.*.*(..))")
	public void afterWrongPin() {
		System.out.println("Invalid Pin");
	}
}
