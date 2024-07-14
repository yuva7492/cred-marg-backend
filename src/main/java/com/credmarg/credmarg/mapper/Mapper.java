package com.credmarg.credmarg.mapper;

import com.credmarg.credmarg.dto.EmailRecordDto;
import com.credmarg.credmarg.dto.EmployeeDto;
import com.credmarg.credmarg.dto.VendorDto;
import com.credmarg.credmarg.entity.EmailRecord;
import com.credmarg.credmarg.entity.Employee;
import com.credmarg.credmarg.entity.Vendor;

public class Mapper {
	
	public static EmployeeDto toEmployeeDto(Employee employee) {
		EmployeeDto employeeDto = new EmployeeDto();
		employeeDto.setId(employee.getId());
		employeeDto.setName(employee.getName());
		employeeDto.setDesignation(employee.getDesignation());
		employeeDto.setCtc(employee.getCtc());
		employeeDto.setEmail(employee.getEmail());
		return employeeDto;
	}

	public static Employee toEmployee(EmployeeDto employeeDto) {
		Employee employee = new Employee();
		employee.setId(employeeDto.getId());
		employee.setName(employeeDto.getName());
		employee.setDesignation(employeeDto.getDesignation());
		employee.setCtc(employeeDto.getCtc());
		employee.setEmail(employeeDto.getEmail());
		return employee;
	}
	public static VendorDto toVendorDto(Vendor vendor) {
		VendorDto vendorDto = new VendorDto();
		vendorDto.setId(vendor.getId());
		vendorDto.setName(vendor.getName());
		vendorDto.setEmail(vendor.getEmail());
		vendorDto.setUpi(vendor.getUpi());
		return vendorDto;
	}

	public static Vendor toVendor(VendorDto vendorDto) {
		Vendor vendor = new Vendor();
		vendor.setId(vendorDto.getId());
		vendor.setName(vendorDto.getName());
		vendor.setEmail(vendorDto.getEmail());
		vendor.setUpi(vendorDto.getUpi());
		return vendor;
	}
	public static EmailRecordDto toEmailRecordDto(EmailRecord emailRecord) {
		EmailRecordDto emailRecordDto = new EmailRecordDto();
		emailRecordDto.setId(emailRecord.getId());
		emailRecordDto.setMessage(emailRecord.getMessage());
		emailRecordDto.setVendorEmail(emailRecord.getVendorEmail());
		emailRecordDto.setVendorName(emailRecord.getVendorName());
		emailRecordDto.setVendorUpi(emailRecord.getVendorUpi());
		return emailRecordDto;
	}

	public static EmailRecord toEmailRecord(EmailRecordDto emailRecordDto) {
		EmailRecord emailRecord = new EmailRecord();
		emailRecord.setId(emailRecordDto.getId());
		emailRecord.setMessage(emailRecordDto.getMessage());
		emailRecord.setVendorEmail(emailRecordDto.getVendorEmail());
		emailRecord.setVendorName(emailRecordDto.getVendorName());
		emailRecord.setVendorUpi(emailRecordDto.getVendorUpi());
		return emailRecord;
	}

}
