 package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrestjpa.entity.Employee;

@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	IEmployeeService service;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@DisplayName("Adding Employee")
	void testAddEmployee() {
		
		Employee emp = new Employee(121,"Chris",45000.0);
		Employee emp1 = service.addEmployee(emp);
		
		assertNotNull(emp1);
		assertEquals(121, emp1.getEid());
	}

	@Test
	void testUpdateEmployee() {
		
	}

	@Test
	void testGetEmployeeById() {
		Employee emp = service.getEmployeeById(121);
		assertEquals("Chris",emp.getEname());
	}

	@Test
	void testDeleteEmployeeById() {
		
	}

	@Test
	void testGetAllEmployees() {
		
		List list = service.getAllEmployees();
		boolean flag = list.isEmpty();
		assertFalse(flag);
		}

}
