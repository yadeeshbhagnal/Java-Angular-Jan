package com.hexaware.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hexaware.aop.exception.InsufficientFund;

@Component
@Aspect
public class Logging {  //aspect

	/*
	 * @Before("execution(* com.hexaware.aop.service.*.*())") //all class, all
	 * methods public void beforeLogs() // join point {
	 * System.out.println("Logs before any bank service method"); }
	 * 
	 * @After("execution(* com.hexaware.aop.service.BankService.fundTransfer())")
	 * //all class, all methods public void afterLogs() // join point {
	 * System.out.println("Logs after fundTransfer method "); }
	 */
	
	/*
	 * @Around("execution(* com.hexaware.aop.service.BankService.withdraw())") //all
	 * class, all methods public void aroundLogs() // join point {
	 * System.out.println("Logs around withdraw method "); }
	 */
	
	@Pointcut("execution(* com.hexaware.aop.service.BankService.checkBalance(..))") //use (..) for parameterized methods
	public void afterReturningPointcut() //pointcut 
	{
		
	}
	
	@AfterReturning(pointcut = "afterReturningPointcut()", returning = "balance" )
	public void afterRetBalance(int balance)
	{
		System.out.println("Logs after returning balance amt: "+balance);
	}
	
	@AfterThrowing(pointcut="afterReturningPointcut()", throwing = "e")
	public void afterThrowing(InsufficientFund e)
	{
		System.out.println("logs after throwing exp " +e);
	}
}
