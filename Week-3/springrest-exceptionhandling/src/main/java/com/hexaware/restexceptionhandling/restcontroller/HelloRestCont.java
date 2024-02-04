package com.hexaware.restexceptionhandling.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloRestCont {

	@GetMapping("/divide/{num1}/{num2}")
	public String divide(@PathVariable int num1, @PathVariable int num2)
	{
		int result = num1/num2;
		return "Division :"+ result;
	}
	
	//@ResponseStatus(value = HttpStatus.EXPECTATION_FAILED, reason=  "Sorry! cannot divide by zero")
	/*
	 * @ExceptionHandler({ArithmeticException.class}) public ResponseEntity<String>
	 * exceptionHandler() { System.out.println("Exception handled"); //just for
	 * verification
	 * 
	 * return new ResponseEntity<String>("Cannot be divided by zero",
	 * HttpStatus.BAD_REQUEST); }
	 */
}
