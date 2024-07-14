package com.credmarg.credmarg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.credmarg.credmarg.entity.Employee;

public interface Employeerepo extends JpaRepository<Employee, Long> {

}
