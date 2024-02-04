package com.hexaware.restpractice_1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.restpractice_1.dto.MobileDTO;
import com.hexaware.restpractice_1.entity.Mobile;
import com.hexaware.restpractice_1.service.IMobileService;

@RestController
@RequestMapping("/api/mobile")
public class MobileRestController {

	@Autowired
	IMobileService service;
	
	@PostMapping("/add")
	public Mobile addMobile(@RequestBody MobileDTO mobileDTO)
	{
		return service.addMobile(mobileDTO);
	}
	
	@PutMapping("/update")
	public boolean updateMobile(@RequestBody MobileDTO mobileDTO)
	{
		return service.updateMobile(mobileDTO);
	}
	
	@GetMapping("/getbyid/{serialId}")
	public MobileDTO getById(@PathVariable int serialId)
	{
		return service.getById(serialId);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getAll()
	{
		return service.getAll();
	}
	
	@DeleteMapping("/delete/{serialId}")
	public String deleteMobile(@PathVariable int serialId)
	{
		return service.deleteMobile(serialId);
	}
}
