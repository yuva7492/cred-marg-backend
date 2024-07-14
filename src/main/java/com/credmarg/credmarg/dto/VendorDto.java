package com.credmarg.credmarg.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendorDto {
	private Long id;
    private String name;
    private String email;
    private String upi;

}
