package com.credmarg.credmarg.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.credmarg.dto.EmailRecordDto;
import com.credmarg.credmarg.dto.VendorDto;
import com.credmarg.credmarg.entity.EmailRecord;
import com.credmarg.credmarg.mapper.Mapper;
import com.credmarg.credmarg.repo.EmailRecordRepo;
import com.credmarg.credmarg.service.EmailRecordService;



@Service
public class EmailService implements EmailRecordService{
	@Autowired
	private EmailRecordRepo emailRepo;
    
	@Override
	public void sendPaymentEmailsToVendors(List<VendorDto> vendorDTOs) {
	
        for (VendorDto vendorDTO : vendorDTOs) {
            String emailContent = createEmailContent(vendorDTO.getName(), vendorDTO.getUpi());
            System.out.println("Sending email to: " + vendorDTO.getEmail());
            System.out.println("Email content: " + emailContent);
            
            EmailRecord emailRecord = new EmailRecord();
            emailRecord.setVendorName(vendorDTO.getName());
            emailRecord.setVendorEmail(vendorDTO.getEmail());
            emailRecord.setVendorUpi(vendorDTO.getUpi());
            emailRecord.setMessage(emailContent);
            emailRepo.save(emailRecord);
        	}
		
		
    }


    private String createEmailContent(String name, String upi) {
        return "Sending payments to vendor " + name + " at upi " + upi;
    }


	@Override
	public List<EmailRecordDto> getEmailRecords() {
		// TODO Auto-generated method stub
		
		return emailRepo.findAll().stream().map(Mapper::toEmailRecordDto).toList();
	}

    
    
}
