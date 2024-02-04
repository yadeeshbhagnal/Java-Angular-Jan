package com.hexaware.springbootweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hexaware.springbootweb.dao.IEmployeeDao;
import com.hexaware.springbootweb.entity.Employee;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	IEmployeeDao dao;
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request, HttpServletResponse response)
	{
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary  =Double.parseDouble(request.getParameter("sal"));
		
		Employee emp=  new Employee(eid,ename,salary);
		
		return dao.addEmployee(emp);
	}
	
	@RequestMapping("/getAll")
	@ResponseBody
	public List<Employee> getAllEmployees()
	{
		return dao.getAll();
	}
	
	@RequestMapping("/get")
	//@ResponseBody            running it as a JSP file without mentioning response body 
	public String get()
	{
		return "success";   // return the .jsp file
	}
	
	
	@RequestMapping(value = "/update",method = RequestMethod.POST)
	@ResponseBody
	public String addEmployee(HttpServletRequest request)
	{
		int eid = Integer.parseInt(request.getParameter("eid"));
		String ename = request.getParameter("ename");
		double salary  =Double.parseDouble(request.getParameter("sal"));
		
		Employee emp=  new Employee(eid,ename,salary);
		
		return dao.updateEmployee(emp);
	}
	
	

	@RequestMapping(value = "/delete")
	@ResponseBody
	public String delete(HttpServletRequest request)
	{
		int eid = Integer.parseInt(request.getParameter("eid"));
		
		return dao.deleteEmployee(eid);
	}
	
	
}
