package com.hexaware.patientspringjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.patientspringjpa.entity.Patient;


@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	@Query("select p from Patient p where p.age between ?1 and ?2")
	List<Patient> getByAgeRange(int min,int max);
}
