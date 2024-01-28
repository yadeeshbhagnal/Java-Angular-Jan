package com.hexaware.patienthibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.patienthibernate.dao.IPatientDao;
import com.hexaware.patienthibernate.entity.Patient;

@Service
public class PatientServiceImp implements IPatientService {

	@Autowired
	IPatientDao dao;
	
	@Override
	public boolean insertPatient(Patient patient) {
		
		return dao.insertPatient(patient);
	}
	
	@Override
	
	public boolean deletePatient(int patientId)
	{
		return dao.deletePatient(patientId);
	}

	@Override
	public List<Patient> selectByName(String patientName) {
		
		return dao.selectByName(patientName);
	}

	@Override
	public List<Patient> selectAll() {
		
		return dao.selectAllPatient();
	}

}
