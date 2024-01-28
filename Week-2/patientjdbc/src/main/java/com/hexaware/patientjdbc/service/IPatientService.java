package com.hexaware.patientjdbc.service;

import java.util.List;

import com.hexaware.patientjdbc.entity.Patient;

public interface IPatientService {

	public boolean insertPatient(Patient patient);
	
	public List<Patient> selectByName(String patientName);
	
	public List<Patient> SelectAllPatient ();
}
