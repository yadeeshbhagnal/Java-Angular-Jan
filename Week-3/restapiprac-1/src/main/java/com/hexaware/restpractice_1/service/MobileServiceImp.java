package com.hexaware.restpractice_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.restpractice_1.dto.MobileDTO;
import com.hexaware.restpractice_1.entity.Mobile;
import com.hexaware.restpractice_1.repository.MobileRepository;


@Service
public class MobileServiceImp implements IMobileService {

	@Autowired
	MobileRepository repo;
	
	@Override
	public Mobile addMobile(MobileDTO mobileDTO) {
		
		Mobile mobile = new Mobile();
		
		mobile.setSerialId(mobileDTO.getSerialId());
		mobile.setBrandName(mobileDTO.getBrandName());
		mobile.setProcessor(mobileDTO.getProcessor());
		mobile.setPrice(mobileDTO.getPrice());
		
		return repo.save(mobile);
	}

	@Override
	public boolean updateMobile(MobileDTO mobileDTO) {
		
		Mobile mobile = new Mobile();
		boolean flag=false;
		
		mobile.setSerialId(mobileDTO.getSerialId());
		mobile.setBrandName(mobileDTO.getBrandName());
		mobile.setProcessor(mobileDTO.getProcessor());
		mobile.setPrice(mobileDTO.getPrice());
		
		Mobile mob = repo.save(mobile);
		if(mob!=null)
		{
			flag =true;
		}
		
		return flag;
	}

	@Override
	public MobileDTO getById(int serialId) {
		
		Mobile mobile = repo.findById(serialId).orElse(null);
		
		
		MobileDTO mobileDTO = new MobileDTO();
		
		mobileDTO.setSerialId(mobile.getSerialId());
		mobileDTO.setBrandName(mobile.getBrandName());
		mobileDTO.setProcessor(mobile.getProcessor());
		mobileDTO.setPrice(mobile.getPrice());
		
		return mobileDTO;
	}

	@Override
	public List<Mobile> getAll() {
		
		return repo.findAll();
	}

	@Override
	public String deleteMobile(int serialId) {
		repo.deleteById(serialId);
		return  " SerialId "+serialId +" deleted ";
	}

}
