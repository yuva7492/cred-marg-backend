package com.credmarg.credmarg.service;

import java.util.List;

import com.credmarg.credmarg.dto.EmailRecordDto;
import com.credmarg.credmarg.dto.VendorDto;

public interface EmailRecordService {

	void sendPaymentEmailsToVendors(List<VendorDto> vendorDTOs);

	List<EmailRecordDto> getEmailRecords();
	
	
}
