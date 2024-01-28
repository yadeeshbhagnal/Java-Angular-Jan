package com.hexaware.springboot1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.springboot1.service.IVehicleService;
import com.hexaware.springboot1.service.VehicleServiceImp;

@SpringBootApplication
public class Springboot1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Springboot1Application.class, args);
		
		IVehicleService service = context.getBean(VehicleServiceImp.class); 
		
		service.getOutput();
		
	}

}
