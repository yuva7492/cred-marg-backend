package com.credmarg.credmarg.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credmarg.credmarg.dto.VendorDto;
import com.credmarg.credmarg.entity.Vendor;
import com.credmarg.credmarg.mapper.Mapper;
import com.credmarg.credmarg.repo.VendorRepo;
import com.credmarg.credmarg.service.VendorService;
@Service
public class VendorServiceImpl implements VendorService {
	@Autowired
	private VendorRepo vendorRepo;

	@Override
	public VendorDto createVendor(VendorDto vendorDto) {
		// TODO Auto-generated method stub
		Vendor vendor = Mapper.toVendor(vendorDto);
		vendor = vendorRepo.save(vendor);
		return Mapper.toVendorDto(vendor);
		
	}

	@Override
	public List<VendorDto> getVendors() {
		// TODO Auto-generated method stub
		return vendorRepo.findAll().stream().map(Mapper::toVendorDto).toList();
	}

	

}
