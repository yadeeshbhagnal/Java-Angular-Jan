package com.hexaware.springrestdemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springrestdemo.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee emp = new Employee();

		emp.setEid(rs.getInt("eid"));
		emp.setEname(rs.getString("empname"));
		emp.setSalary(rs.getDouble("salary"));

		return emp;
	}

}