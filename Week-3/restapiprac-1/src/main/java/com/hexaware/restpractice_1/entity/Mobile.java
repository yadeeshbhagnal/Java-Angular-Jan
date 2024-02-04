package com.hexaware.restpractice_1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Mobile {

	@Id
	private int serialId;
	private String brandName;
	private String processor;
	private double price;
	
	public Mobile()
	{
		
	}

	public Mobile(int serialId, String brandName, String processor, double price) {
		super();
		this.serialId = serialId;
		this.brandName = brandName;
		this.processor = processor;
		this.price = price;
	}

	public int getSerialId() {
		return serialId;
	}

	public void setSerialId(int serialId) {
		this.serialId = serialId;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getProcessor() {
		return processor;
	}

	public void setProcessor(String processor) {
		this.processor = processor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [serialId=" + serialId + ", brandName=" + brandName + ", processor=" + processor + ", price="
				+ price + "]";
	}
	
	
	
}
