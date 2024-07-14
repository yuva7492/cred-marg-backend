package com.credmarg.credmarg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credmarg.credmarg.entity.Vendor;

public interface VendorRepo extends JpaRepository<Vendor, Long> {

}
