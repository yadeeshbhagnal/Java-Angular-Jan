package com.hexaware.springrestjpa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class EmpExceptionHandler {   // global exception handler, it will handle exp everywhere

	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Employee not found in DB")
	@ExceptionHandler({EmployeeNotFoundException.class})
	public void handler()
	{
		System.out.println("Exception handled");
	}
}
