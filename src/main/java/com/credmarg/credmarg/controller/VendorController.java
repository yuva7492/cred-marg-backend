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

import com.credmarg.credmarg.dto.VendorDto;
import com.credmarg.credmarg.service.VendorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/vendor")
@CrossOrigin("*")
public class VendorController {
	@Autowired
	private VendorService vendorService;
	
	@PostMapping("/create")
	public ResponseEntity<VendorDto> createVendor(@RequestBody @Valid VendorDto vendorDto) {
		// TODO Auto-generated method stub
		VendorDto vendor = vendorService.createVendor(vendorDto);
		return new ResponseEntity<>(vendor,HttpStatus.CREATED);
	}
	@GetMapping("/all")
	public ResponseEntity<List<VendorDto>> getVendors() {
		// TODO Auto-generated method stub
		List<VendorDto> vendors = vendorService.getVendors();
		return new ResponseEntity<>(vendors,HttpStatus.OK);
	}

}
