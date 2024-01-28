package com.hexaware.springboot1.dao;

import org.springframework.stereotype.Repository;

@Repository
public class VehicleDaoImp implements IVehicleDao {

	@Override
	public void getOutput() {
		System.out.println("Vehicle available here!!!");

	}

}
