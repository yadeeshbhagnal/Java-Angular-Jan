package entity;

public class Department {

	private int dno;
	private String danme;
	private String location;
	
	public Department()
	{
		
	}

	public Department(int dno, String danme, String location) {
		super();
		this.dno = dno;
		this.danme = danme;
		this.location = location;
	}

	public int getDno() {
		return dno;
	}

	public void setDno(int dno) {
		this.dno = dno;
	}

	public String getDanme() {
		return danme;
	}

	public void setDanme(String danme) {
		this.danme = danme;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Department [dno=" + dno + ", danme=" + danme + ", location=" + location + "]";
	}
	
	
}
