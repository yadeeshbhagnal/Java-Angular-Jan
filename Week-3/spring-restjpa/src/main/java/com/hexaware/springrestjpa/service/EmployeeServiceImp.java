package com.hexaware.springrestjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entity.Employee;
import com.hexaware.springrestjpa.repository.EmployeeRepo;

import jakarta.transaction.Transactional;

@Transactional  
@Service
public class EmployeeServiceImp implements IEmployeeService {

	
	@Autowired
	EmployeeRepo repo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		return repo.save(employee);
	}

	@Override
	public Employee getEmployeeById(long eid) {
		
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteEmployeeById(long eid) {
		
		repo.deleteById(eid);
		return "Record Deleted";
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return repo.findAll();
	}

	@Override
	public List<Employee> getByEname(String ename) {
		
		return repo.findByEname(ename);
	}


	@Override
	public List<Employee> getBySalaryGT(double salary) {
		
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> getBySalarySorted() {

		//return repo.findAll(Sort.by(Order.asc("salary")));
		
		return repo.findAll(Sort.by("salary")); //alternate way
	}

	@Override
	public List<Employee> getBySalaryRange(double min, double max) {
		
		return repo.getBySalaryRange(min, max);
	}

	@Override
	public int deleteByEname(String ename) {
		
		return repo.deleteByEname(ename);
	}


}
