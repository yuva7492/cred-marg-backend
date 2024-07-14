package com.credmarg.credmarg.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.credmarg.dto.EmployeeDto;
import com.credmarg.credmarg.entity.Employee;
import com.credmarg.credmarg.mapper.Mapper;
import com.credmarg.credmarg.repo.Employeerepo;
import com.credmarg.credmarg.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private Employeerepo employeeRepo;
	

	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		// TODO Auto-generated method stub
		Employee employee = Mapper.toEmployee(employeeDto);
		employee = employeeRepo.save(employee);
		return Mapper.toEmployeeDto(employee);
		
	}

	@Override
	public List<EmployeeDto> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll().stream().map(Mapper::toEmployeeDto).toList();
		
	}

}
