package com.hexaware.springrestdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestdemo.entity.Employee;
import com.hexaware.springrestdemo.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;
	
	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee emp)  //controller reading data from response body
	{
		return service.addEmployee(emp);   // sending data to service layer
	}
	
	@GetMapping("/getAll")
	public List<Employee> getAll()
	{
		return service.getAllEmployees();
	}
	
	@GetMapping("/get/{eid}")
	public Employee getEmployeeById(@PathVariable int eid)  //to read data from path
	{
		return service.getEmployeeById(eid);
	}
	
	@DeleteMapping("/delete/{eid}")
	public String deleteById(@PathVariable int eid)
	{
		return service.deleteEmployeeById(eid);
	}
	
	@PutMapping("/update")
	public Employee update(@RequestBody Employee emp)
	{
		return service.updateEmployee(emp);
	}
	
	
}
