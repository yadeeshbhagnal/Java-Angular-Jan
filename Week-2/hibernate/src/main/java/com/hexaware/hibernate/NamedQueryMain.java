package com.hexaware.hibernate;

import java.util.List;

import com.hexaware.hibernate.entity.Employee;

public class NamedQueryMain {

	public static void main(String[] args) {
		
		EmployeeDao dao = new EmployeeDao();
		
		List<Employee> list = dao.getAllEmp();
		System.out.println("Employee list for named query");
		
		System.out.println(list);
		
		Employee emp = dao.getEmployeeByName();
		System.out.println(emp);

	}

}
