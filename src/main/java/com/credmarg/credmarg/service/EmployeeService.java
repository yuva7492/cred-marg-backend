package com.credmarg.credmarg.service;

import java.util.List;

import com.credmarg.credmarg.dto.EmployeeDto;

public interface EmployeeService {
	
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	List<EmployeeDto> getEmployees();

}
