package com.hexaware.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.aop.config.ConfigApp;
import com.hexaware.aop.exception.InsufficientFund;
import com.hexaware.aop.service.BankService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);
      
      BankService service = context.getBean(BankService.class);
      
      service.login();
      service.Deposit();
      service.withdraw();
      service.fundTransfer();
      try {
		service.checkBalance(20);
	} catch (InsufficientFund e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
      
      
      
    }
    
    
}
