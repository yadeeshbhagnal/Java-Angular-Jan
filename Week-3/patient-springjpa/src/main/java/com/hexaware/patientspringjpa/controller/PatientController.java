package com.hexaware.patientspringjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.patientspringjpa.entity.Patient;
import com.hexaware.patientspringjpa.service.IPatientService;


import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/patient")
public class PatientController {

	@Autowired
	IPatientService service;
	
	@PostMapping("/add")
	public Patient insertPatient(@RequestBody Patient patient)
	{
		return service.addPatient(patient);
	}
	@PutMapping("/update")
	public Patient updatePatient(@RequestBody @Valid Patient patient)
	{
		return service.updatePatient(patient);
	}
	
	@GetMapping("/get/{patientId}")
	public Patient getPatientById(@PathVariable int patientId)
	{
		return service.getPatientById(patientId);
	}
	

	@GetMapping("/getAll")
	public List<Patient> getAll()
	{
		return service.getAllPatients();
	}
	
	@DeleteMapping("/delete/{patientId}")
	public String deleteById(@PathVariable int patientId)
	{
		return service.deletePatientById(patientId);
	}
	
	@GetMapping("/agerange/{min}/{max}")
	public List<Patient> getByAgeRange(@PathVariable int min,@PathVariable int max)
	{
		return service.getByAgeRange(min, max);
	}
	
}
