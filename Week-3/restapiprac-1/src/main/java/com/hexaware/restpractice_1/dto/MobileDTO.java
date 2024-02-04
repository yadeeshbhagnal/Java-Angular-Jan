package com.hexaware.restpractice_1.dto;

public class MobileDTO {

	private int serialId;
	private String brandName;
	private String processor;
	private double price;
	
	public MobileDTO() {
		super();
	}

	public MobileDTO(int serialId, String brandName, String processor, double price) {
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
		return "MobileDTO [serialId=" + serialId + ", brandName=" + brandName + ", processor=" + processor + ", price="
				+ price + "]";
	}
	
	
}
