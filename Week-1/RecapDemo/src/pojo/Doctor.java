package pojo;

import java.util.Objects;

public class Doctor {
	
	private int did;
	private String dname;
	private String dept;
	
	public Doctor()
	{
		
	}
	
	public Doctor (int did, String dname, String dept)
	{
		this.did = did;
		this.dname= dname;
		this.dept = dept;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Doctor [did=" + did + ", dname=" + dname + ", dept=" + dept + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(did);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return did == other.did;
	}

	
	
	
	
	
}
