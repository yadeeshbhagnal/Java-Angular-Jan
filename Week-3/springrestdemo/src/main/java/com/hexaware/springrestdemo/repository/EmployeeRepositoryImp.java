package com.hexaware.springrestdemo.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestdemo.entity.Employee;

@Repository
public class EmployeeRepositoryImp implements IEmployeeRepository {

	JdbcTemplate jdbcTemplate;
	
	
	public EmployeeRepositoryImp() {
		
		
	}
	
	@Autowired
	public EmployeeRepositoryImp(DataSource datasource) {
		
		jdbcTemplate = new JdbcTemplate(datasource);
	}

	@Override
	public Employee addEmployee(Employee emp) {
		
		Employee employee = null;
		
		String insert = "insert into employeedetails values (?,?,?)";
		
		int count = jdbcTemplate.update(insert, emp.getEid(), emp.getEname(), emp.getSalary());
		if(count>0)
		{
			employee = emp;
		}
		
		return emp;
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		Employee employee =null;
		
		String update  ="update employeedetails set empname=?, salary=? where eid=?";
		
		int count = jdbcTemplate.update(update,emp.getEname(),emp.getSalary(),emp.getEid());
		if(count>0)
		{
			employee=emp;
		}
		return emp;
	}

	@Override
	public String deleteEmployeeById(int eid) {
		
		String delete = "delete from employeedetails where eid = ?";
		int count = jdbcTemplate.update(delete,eid);
		return count+"record deleted";
	}

	@Override
	public Employee getEmployeeById(int eid) {
		
		String getById = "select eid, empname, salary from employeedetails where eid = ?";
		return jdbcTemplate.queryForObject(getById, new EmployeeMapper(), eid);
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		String selectAll  ="select eid,empname,salary from employeedetails";
		List <Employee> list = jdbcTemplate.query(selectAll, new EmployeeMapper());
		
		return list;
	}

}
