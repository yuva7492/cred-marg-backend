package com.credmarg.credmarg.entity;




import org.hibernate.validator.constraints.UniqueElements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import lombok.Data;
@Entity
@Table(name = "employees")
@Data
public class Employee {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    private String name;
	
    private String designation;
	
    private double ctc;
    @Email
    @Column(unique = true)
	private String email;
}
