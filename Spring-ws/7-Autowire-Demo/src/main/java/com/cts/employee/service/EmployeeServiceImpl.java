package com.cts.employee.service;

import org.springframework.stereotype.Service;

@Service("empService")
public class EmployeeServiceImpl implements EmployeeService{


	
	public void f1() {
		System.out.println("--- f1 method called ");
	}
	
	public void info() {
		System.out.println("This is EmployeeServiceImpl class..");
		
	}
	
	

}
