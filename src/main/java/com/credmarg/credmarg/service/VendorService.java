package com.credmarg.credmarg.service;

import java.util.List;

import com.credmarg.credmarg.dto.VendorDto;

public interface VendorService {
	VendorDto createVendor(VendorDto vendorDto);
	List<VendorDto> getVendors();
	
}
