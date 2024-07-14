package com.credmarg.credmarg.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto {

	 private Long id;
	    private String name;
	    private String designation;
	    private double ctc;
	    private String email;


}
