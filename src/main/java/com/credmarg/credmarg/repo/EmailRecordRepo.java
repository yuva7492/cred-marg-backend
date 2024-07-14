package com.credmarg.credmarg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credmarg.credmarg.entity.EmailRecord;

public interface EmailRecordRepo extends JpaRepository<EmailRecord, Long> {

}
