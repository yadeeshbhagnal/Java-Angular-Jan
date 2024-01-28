package com.hexaware.patientjdbc.entity;

import java.sql.Date;

public class Patient {

	private int patientId;
	private String patientName;
	private int age;
	private Date date;
	private String gender;
	
	public Patient()
	{
		
	}

	public Patient(int patientId, String patientName, int age, Date date, String gender) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.age = age;
		this.date = date;
		this.gender = gender;
	}

	public int getPatientId() {
		return patientId;
	}

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", age=" + age + ", date=" + date
				+ ", gender=" + gender + "]";
	}
	
}
