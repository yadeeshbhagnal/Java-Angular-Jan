package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Authentication {

	@Pointcut("execution(* com.hexaware.aop.service.BankService.login())")
	public void authentication() // pointcut 1
	{
		
	}
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.*())")
	public void authorization()  //pointcut 2
	{
		
	}
	
	@Before("authentication() && authorization()")  //using multiple pointcuts
	public void authenticationAuthorization()  //join point
	{
		System.out.println("Login verified, authorization verified");
	}
	
}
