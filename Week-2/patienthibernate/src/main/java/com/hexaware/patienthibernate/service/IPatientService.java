package com.hexaware.patienthibernate.service;

import java.util.List;

import com.hexaware.patienthibernate.entity.Patient;

public interface IPatientService {

	public boolean insertPatient(Patient patient);
	public List<Patient> selectByName (String patientName);
	public List<Patient> selectAll ();
	public boolean deletePatient(int patientId);
}
