package com.hexaware.patientjdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.patientjdbc.dao.IPatientDao;
import com.hexaware.patientjdbc.entity.Patient;

@Service
public class PatientServiceImp implements IPatientService {

	@Autowired
	IPatientDao dao;
	
	@Override
	public boolean insertPatient(Patient patient) {
	
		return dao.insertPatient(patient);
	}

	@Override
	public List <Patient> selectByName(String patientName) {
		
		return dao.selectByName(patientName);
	}

	@Override
	public List<Patient> SelectAllPatient() {
		
		return dao.SelectAllPatient();
	}

}
