package com.march.batch.springboot.staticdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.march.batch.springboot.staticdb.model.Employee;
import com.march.batch.springboot.staticdb.serviceImpl.EmployeeService;

@RestController
public class EmployeeCoontroller {

	@Autowired
	EmployeeService employeeService;

	@PostMapping(value = "/employee/create")
	public ResponseEntity<Object> createEmployee(@RequestBody Employee employee) {

		employeeService.createEmployee(employee);
		return new ResponseEntity<Object>("Successfullt Created Employee", HttpStatus.OK);
	}

	@GetMapping(value = "/employee/getemployee/{id}")
	public ResponseEntity<Object> getEmployeeByEmployeeId(@PathVariable String id) {

		Employee response = null;
		response = employeeService.getEmployeeByEmployeeId(id);
		return new ResponseEntity<Object>(response, HttpStatus.OK);
	}

	@PutMapping(value = "/employee/update")
	public ResponseEntity<Object> updateEmployee(@RequestBody Employee employee) {

		Employee response = null;
		response = employeeService.updateEmployee(employee);
		return new ResponseEntity<Object>(response, HttpStatus.OK);

	}

	@DeleteMapping(value = "/employee/empid/{empId}")
	public ResponseEntity<Object> deleteEmployee(@PathVariable String empId) {
		
		employeeService.deleteEmployee(empId);
		return new ResponseEntity<Object>("Successfullt Deleted Employee", HttpStatus.OK);
	}

}
