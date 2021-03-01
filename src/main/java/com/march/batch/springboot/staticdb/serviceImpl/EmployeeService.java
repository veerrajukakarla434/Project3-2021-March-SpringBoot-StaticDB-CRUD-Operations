package com.march.batch.springboot.staticdb.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.march.batch.springboot.staticdb.model.Employee;
import com.march.batch.springboot.staticdb.service.IEmployeeService;

@Service
public class EmployeeService implements IEmployeeService {
	
	
	 public static final Map<String, Employee> staticDB = new HashMap<>(); 
	
	
	 static {
		 
		 Employee employee = new Employee();
		 employee.setEmmId("100");
		 employee.setName("Somesh");
		 employee.setAddress("Bangolore");
		 employee.setPhone("1234567890");
		 staticDB.put(employee.getEmmId(), employee);
		 
	 }
	

	@Override
	public void createEmployee(Employee employee) {
		staticDB.put(employee.getEmmId(), employee);

	}

	@Override
	public Employee getEmployeeByEmployeeId(String Id) {
		Employee empResponse = staticDB.get(Id);
		return empResponse;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		staticDB.put(employee.getEmmId(), employee);
		Employee empResponse = staticDB.get(employee.getEmmId());
		return empResponse;
	}

	@Override
	public void deleteEmployee(String empId) {
		
		staticDB.remove(empId);
	}

}
