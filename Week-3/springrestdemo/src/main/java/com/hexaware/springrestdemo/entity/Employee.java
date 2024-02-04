package com.hexaware.springrestdemo.entity;

public class Employee {

	private int eid;
	private String ename;
	private Double salary;
	
	
	public Employee() {
		super();
	}


	public Employee(int eid, String ename, Double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
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
	
	
}
