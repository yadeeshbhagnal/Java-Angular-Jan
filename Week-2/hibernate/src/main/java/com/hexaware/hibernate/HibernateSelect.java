package com.hexaware.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate.entity.Employee;
import com.hexaware.hibernate.HibernateUtil;

public class HibernateSelect {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
	    Session session =	sessionFactory.openSession();
	    
	    // HQL query syntax
	    String selectAll = "select e from Employee e where e.salary > ?1";
	    
	    // has limitation, cannot return 
	   // limited attributes like e.eid, e.ename having diff data types
	     
	    Query <Employee> query = session.createQuery(selectAll);
	    query.setParameter(1, 30000.0);
	    
	    List<Employee> list= query.getResultList();
	    
	    for(Employee employee: list)
	    {
	    	System.out.println(employee);
	    }
	    
	    String selectQ = "select e from Employee e where e.ename like '%i%' ";
	   Query <Employee> query2 =  session.createQuery(selectQ);
	   
	  System.out.println( query2.getResultList());
	  
	  String nativeQuery = "select * from EmployeeDetails ";  // using native (SQL) query
	  NativeQuery <Employee> query3 = session.createNativeQuery(nativeQuery, Employee.class);
	  
	  List<Employee> list1 = query3.getResultList();
	  
	  System.out.println("native query result");
	  System.out.println(list1);
	  
	  

	}

}
