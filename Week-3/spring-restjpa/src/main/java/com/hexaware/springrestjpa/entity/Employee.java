package com.hexaware.springrestjpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name="employee_info")
public class Employee {

	@Id
	@Min(100)
	private long eid;
	@Pattern(regexp = "[A-Z][a-z]{3,10}")
	private String ename;
	@Min(1000)
	@Max(60000)
	private Double salary;
	
	public Employee() {
		super();
	}

	public Employee(long eid, String ename, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}

	public long getEid() {
		return eid;
	}

	public void setEid(long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
}
