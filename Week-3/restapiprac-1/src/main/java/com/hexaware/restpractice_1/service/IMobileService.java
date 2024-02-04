package com.hexaware.restpractice_1.service;

import java.util.List;

import com.hexaware.restpractice_1.dto.MobileDTO;
import com.hexaware.restpractice_1.entity.Mobile;

public interface IMobileService {

	public Mobile addMobile(MobileDTO mobileDTO);
	
	public boolean updateMobile(MobileDTO mobileDTO);
	
	public MobileDTO getById(int serialId);
	
	public List<Mobile> getAll();
	
	public String deleteMobile(int serialId);
}
