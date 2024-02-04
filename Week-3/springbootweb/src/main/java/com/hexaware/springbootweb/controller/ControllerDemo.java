package com.hexaware.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/webapp")
public class ControllerDemo {

	
	@RequestMapping("/hello")  //mandatory to write, by default accepts GET method
	@ResponseBody
	public String sayHello()
	{
		return "Hello from controller";
	}
	
	@RequestMapping("/show")  //mandatory to write, by default accepts GET method
	@ResponseBody
	public String show()
	{
		return "Welcome to springboot web";
	}
}
