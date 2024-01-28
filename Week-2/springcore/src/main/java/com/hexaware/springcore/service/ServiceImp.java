package com.hexaware.springcore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springcore.dao.IDao;

@Service
public class ServiceImp implements IService {

	@Autowired
	IDao dao;
	
	
	@Override
	public void getService() {
		
		System.out.println("service execution done !!");
		System.out.println("service got dao object "+dao);
		dao.getDao();
		
	}

}
