package com.hexaware.springcore.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	
	public Address()
	{
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
