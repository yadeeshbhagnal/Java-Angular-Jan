package com.hexaware.patientjdbc.dao;

import java.util.List;

import com.hexaware.patientjdbc.entity.Patient;

public interface IPatientDao {

public boolean insertPatient(Patient patient);
	
	public List<Patient> selectByName(String patientName);
	
	public List<Patient> SelectAllPatient ();
}
