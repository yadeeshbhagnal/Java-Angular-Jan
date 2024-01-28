package com.hexaware.patientjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.patientjdbc.entity.Patient;


@Repository
public class PatientDaoImp implements IPatientDao {

	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public PatientDaoImp(DataSource datasource)
	{
		jdbcTemplate = new JdbcTemplate(datasource);
		
	}
	
	@Override
	public boolean insertPatient(Patient patient) {
		
		String insert  = "insert into patient(pid, pname,age,dob,gender) values(?,?,?,?,?)";
		int count = jdbcTemplate.update(insert,patient.getPatientId(), patient.getPatientName(), patient.getAge(), patient.getDate(), patient.getGender());
		
		
		return count>0;
	}

	@Override
	public List <Patient> selectByName(String patientName) {
		
		String selectByName = "select pid, pname,age,dob, gender from patient where pname = ?";
		List <Patient> list = jdbcTemplate.query(selectByName, new ProductMapper(), patientName);
		
		return list;
	}

	@Override
	public List<Patient> SelectAllPatient() {
		
		String selectAll = "select pid, pname,age,dob, gender from patient";
		List<Patient> list = jdbcTemplate.query(selectAll, new ProductMapper());
		
		return list;
	}

}
