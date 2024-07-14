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

import com.credmarg.credmarg.dto.EmailRecordDto;
import com.credmarg.credmarg.dto.VendorDto;
import com.credmarg.credmarg.serviceimpl.EmailService;
@RestController
@RequestMapping("/email")
@CrossOrigin("*")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	 @PostMapping("/send")
	    public ResponseEntity<String> sendEmailToVendors(@RequestBody List<VendorDto> vendorDTOs){
	        emailService.sendPaymentEmailsToVendors(vendorDTOs);
	        return new ResponseEntity<>("Email sent successfully", HttpStatus.OK);
	    }
	 @GetMapping("/all")
	    public ResponseEntity<List<EmailRecordDto>> getEmailRecords(){
	        List<EmailRecordDto> emailRecords = emailService.getEmailRecords();
	        return new ResponseEntity<>(emailRecords,HttpStatus.OK);
	    }

}
