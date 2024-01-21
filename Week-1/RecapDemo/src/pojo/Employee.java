package pojo;

import java.util.Objects;

public class Employee {

	private int eid;
	private String ename;
	private double salary;
	
	public Employee()
	{
		
	}
	
	public Employee (int eid, String ename, double salary)
	{
		this.eid = eid;
		this.ename= ename;
		this.salary = salary;
	}
	
	public void setEid (int eid) {
		this.eid= eid;
	}
	public int getEid()
	{
		return eid;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEname() {
		return ename;
	}

	@Override
	public int hashCode() {
		return Objects.hash(eid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return eid == other.eid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	
}