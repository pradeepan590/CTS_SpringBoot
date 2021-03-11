package com.cts.employee.service;

import org.springframework.stereotype.Service;

@Service("accService")
public class AccountServiceImpl implements EmployeeService {
	@Override
	public void info() {
		System.out.println("-- Information about AccountServiceImpl class");

	}

}
