package com.hexaware.patientjdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.patientjdbc.entity.Patient;

public class ProductMapper implements RowMapper<Patient> {

	@Override
	public Patient mapRow(ResultSet rs, int rowNum) throws SQLException {
		Patient patient = new Patient();
		
		patient.setPatientId(rs.getInt("pid"));
		patient.setPatientName(rs.getString("pname"));
		patient.setAge(rs.getInt("age"));
		patient.setDate(rs.getDate("dob"));
		patient.setGender(rs.getString("gender"));
		
		return patient;
	}

}
