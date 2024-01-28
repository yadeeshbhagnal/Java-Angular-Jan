package com.hexaware.springboot1.entity;

public class Vehicle {

	private int vehicleId;
	private String vehicleType;
	
	public Vehicle() {
		super();
	}

	public Vehicle(int vehicleId, String vehicleType) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
	}

	public int getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(int vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "Vehicle [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + "]";
	}
	
	
	
}
