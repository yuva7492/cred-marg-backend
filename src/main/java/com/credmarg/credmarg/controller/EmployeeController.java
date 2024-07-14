package com.credmarg.credmarg.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.credmarg.credmarg.dto.EmployeeDto;
import com.credmarg.credmarg.service.EmployeeService;

import jakarta.validation.Valid;
@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeController {
	@Autowired	
	private EmployeeService employeeService;
	@PostMapping("/create")
	public ResponseEntity<EmployeeDto> createEmployee(@RequestBody @Valid EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		EmployeeDto employee = employeeService.createEmployee(employeeDto);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<EmployeeDto>> getEmployees() {
		// TODO Auto-generated method stub
		List<EmployeeDto> employees = employeeService.getEmployees();
		return new ResponseEntity<>(employees,HttpStatus.OK);
	}
}
