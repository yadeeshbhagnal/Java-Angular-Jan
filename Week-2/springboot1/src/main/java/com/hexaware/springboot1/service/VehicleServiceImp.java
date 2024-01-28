package com.hexaware.springboot1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springboot1.dao.IVehicleDao;

@Service
public class VehicleServiceImp implements IVehicleService {

	@Autowired
	IVehicleDao dao ;
	
	@Override
	public void getOutput() {
		dao.getOutput();

	}

}
