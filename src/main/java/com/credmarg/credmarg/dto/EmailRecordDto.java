package com.credmarg.credmarg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailRecordDto {
	
	private Long id;
    private String vendorName;
    private String vendorEmail;
    private String vendorUpi;
    private String message;

}
