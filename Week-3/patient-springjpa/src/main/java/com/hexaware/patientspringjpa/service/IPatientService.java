package com.hexaware.patientspringjpa.service;

import java.util.List;

import com.hexaware.patientspringjpa.entity.Patient;

public interface IPatientService {

	
	public Patient addPatient(Patient patient);
	 
	public Patient updatePatient(Patient patient);
 
	public Patient getPatientById(int patientId);
 
	public String deletePatientById(int patientId);
	
	public  List<Patient>  getAllPatients();
	
	List<Patient> getByAgeRange(int min,int max);
}
