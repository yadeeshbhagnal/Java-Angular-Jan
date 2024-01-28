package com.hexaware.hibernate;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.entity.Employee;
import com.hexaware.hibernate.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();  
        
        System.out.println(sessionFactory);
        
        Session session = sessionFactory.openSession();
        
        System.out.println(session);
        
       Transaction txn =  session.beginTransaction();  // starting the transaction , mandatory only for DML
       
//       Employee emp = new Employee(101, "Adam Davis", 55000);
//       
//       Serializable ser = session.save(emp);
//       System.out.println(ser.toString()); // just to confirm 
       
//       Employee emp2 = new Employee(103,"ford",50000);
//       Employee emp3 = new Employee(104,"ravi", 40000);
//       
//       Serializable ser1 = session.save(emp2);
//       Serializable ser2 = session.save(emp3);
       
//       Employee emp1 = session.get(Employee.class, 101);  // fetch 1 record
//       System.out.println(emp1);
//       
//       emp1.setEname("Adam Davis");           // update operation
//       emp1.setSalary(55000);
//       Serializable ser = session.save(emp1);
//       System.out.println("updated record "+ser.toString());
       
//       
//       Employee updatedEmp = session.get(Employee.class, 101);  // fetching 1 record i.e 101 id
//       System.out.println(updatedEmp);
//       
//       session.delete(updatedEmp);
       
       
       
       txn.commit();
    }
}
