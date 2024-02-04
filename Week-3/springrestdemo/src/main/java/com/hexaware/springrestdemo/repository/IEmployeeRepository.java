package com.hexaware.springrestdemo.repository;

import java.util.List;

import com.hexaware.springrestdemo.entity.Employee;

public interface IEmployeeRepository {

	public Employee addEmployee(Employee emp);
	
	public Employee updateEmployee(Employee emp);
	
	public String deleteEmployeeById(int eid);
	
	public Employee getEmployeeById(int eid);
	
	public List<Employee> getAllEmployees();
}
