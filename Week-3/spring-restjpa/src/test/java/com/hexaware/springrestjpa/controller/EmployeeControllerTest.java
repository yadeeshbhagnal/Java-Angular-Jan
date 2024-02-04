package com.hexaware.springrestjpa.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entity.Employee;



@SpringBootTest
class EmployeeControllerTest {

	@Autowired
	RestTemplate restTemplate;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testInsertEmployee() {
		
		Employee emp = new Employee(122,"David",57000.0);
		ResponseEntity<Employee> response =restTemplate.postForEntity("http://localhost:8080/api/employee/add",emp,Employee.class);
		Employee emp2 = response.getBody();
		assertEquals(122, emp2.getEid());
	}

	@Test
	
	void testUpdateEmployee() {
		Employee emp = new Employee(122,"Jordan",35000.0);
		restTemplate.put("http://localhost:8080/api/employee/update",emp);
		assertTrue(true);
		
	}

	@Test
	
	void testGetEmployeeById() {
		
		int eid =101;
		ResponseEntity<Employee> response= restTemplate.getForEntity("http://localhost:8080/api/employee/get/"+eid, Employee.class);
		
		Employee emp = response.getBody();
		
		assertEquals("sam",emp.getEname());
	}
	@Disabled
	@Test
	void testGetAll() {
		
		ResponseEntity<List> response =restTemplate.getForEntity("http://localhost:8080/api/employee/getAll",List.class);
		List <Employee>list = response.getBody();
		//asssertTrue(list.size()>0);
		
	}

	@Test
	void testDeleteById() {
		
	}

}
