package com.hexaware.patienthibernate.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hexaware.patienthibernate.entity.Patient;



@Repository
public class PatientDaoImp implements IPatientDao {
	
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	
	Session session = sessionFactory.openSession();

	@Override
	public boolean insertPatient(Patient patient) {
		
		Transaction txn =session.beginTransaction();
		Serializable ser = session.save(patient);
		txn.commit();
		if(ser!= null)
		{
			return true;
		}
		
		return false;
	}
	
	@Override
	public boolean deletePatient(int patientId) {
		
		Transaction txn = session.beginTransaction();
		
		Patient patient = session.get(Patient.class, patientId);
		
		if(patient!= null)
		{
			session.delete(patient);
			txn.commit();
			return true;
		}
		return false;
	}

	@Override
	public List<Patient> selectByName(String patientName) {
		
		Query query = session.createNamedQuery("selectByName");
		query.setParameter(1,patientName);
		
		List<Patient> list =  query.getResultList();
		
		return list;
	}

	@Override
	public List<Patient> selectAllPatient() {
		
		Query query = session.createNamedQuery("selectAllPatient");
		
		List<Patient> list = query.getResultList();
		
		return list;
	}

}
