package com.hexaware.patientspringjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.patientspringjpa.entity.Patient;
import com.hexaware.patientspringjpa.repository.PatientRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class PatientServiceImp implements IPatientService {

	@Autowired
	PatientRepository repo;
	
	@Override
	public Patient addPatient(Patient patient) {
		
		return repo.save(patient);
	}

	@Override
	public Patient updatePatient(Patient patient) {
		
		return repo.save(patient);
	}

	@Override
	public Patient getPatientById(int patientId) {
	
		return repo.findById(patientId).orElse(null);
	}

	@Override
	public String deletePatientById(int patientId) {
		
		repo.deleteById(patientId);
		return "Record Deleted";
	}

	@Override
	public List<Patient> getAllPatients() {
		
		return repo.findAll();
	}

	@Override
	public List<Patient> getByAgeRange(int min, int max) {
		
		return repo.getByAgeRange(min, max);
	}

}
