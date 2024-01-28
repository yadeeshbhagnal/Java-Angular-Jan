package com.hexaware.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hexaware.springcore.entity.Address;
import com.hexaware.springcore.entity.Employee;
import com.hexaware.springcore.service.IService;
import com.hexaware.springcore.service.ServiceImp;

/**
 * Hello world!
 *
 */


public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       ApplicationContext context =  new AnnotationConfigApplicationContext(AppConfig.class);
       
     Employee emp =   context.getBean("emp", Employee.class);
     
		/*
		 * Address address = context.getBean(Address.class); address.setCity("Mumbai");
		 */
     
     emp.setEid(100);
     emp.setEname("Adam");
     //emp.setAddress(address);  // Dependency Injection for setter
     
     System.out.println(emp);
     Employee emp2 =   context.getBean("emp", Employee.class);
     System.out.println(emp2.getAddress());
     
     System.out.println(emp.getEid());
     System.out.println(emp2.getEname());
     
    IService service = context.getBean(ServiceImp.class); // always give interface reference(best prac)
    
    service.getService();
    
    String name = context.getBean(String.class);  //calling String object
    System.out.println(name);
    }
}
