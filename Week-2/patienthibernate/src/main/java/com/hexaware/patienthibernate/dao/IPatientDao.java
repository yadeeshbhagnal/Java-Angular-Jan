package com.hexaware.patienthibernate.dao;

import java.util.List;

import com.hexaware.patienthibernate.entity.Patient;

public interface IPatientDao {

	public boolean insertPatient(Patient patient);
	public List<Patient> selectByName (String patientName);
	public List<Patient> selectAllPatient();
	public boolean deletePatient(int patientId);
}
