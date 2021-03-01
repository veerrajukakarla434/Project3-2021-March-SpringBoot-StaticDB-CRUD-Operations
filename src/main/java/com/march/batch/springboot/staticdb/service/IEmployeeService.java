package com.march.batch.springboot.staticdb.service;

import com.march.batch.springboot.staticdb.model.Employee;

public interface IEmployeeService {
	
	
	  public void createEmployee(Employee employee);
	  
      public Employee getEmployeeByEmployeeId(String Id);
      
      public Employee updateEmployee (Employee employee);
      
      public void deleteEmployee (String empId);
}
