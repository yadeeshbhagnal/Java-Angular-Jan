package com.hexaware.hibernate;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.hibernate.entity.Employee;
import com.hexaware.hibernate.HibernateUtil;

public class EmployeeDao {

	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
    Session session =	sessionFactory.openSession();
	
	public List<Employee> getAllEmp()
	{
		Query query = session.createNamedQuery("getAllEmp");
		
		List <Employee> list =  query.getResultList();
		

		return list;
	}
	
	public Employee getEmployeeByName()
	{
		Query query = session.createNamedQuery("getEmployeeByName");
		query.setParameter("name", "ravi");
		
		Employee emp = (Employee)query.getSingleResult();
		
		return emp;
		
	}
}
