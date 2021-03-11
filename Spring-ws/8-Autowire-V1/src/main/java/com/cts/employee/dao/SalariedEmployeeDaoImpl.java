package com.cts.employee.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository("salariedEmpDao")
public class SalariedEmployeeDaoImpl implements EmployeeDao{
	
	public SalariedEmployeeDaoImpl() {
		System.out.println("SalariedEmployeeDaoImpl class object created..");
	}
	
	public void saveEmployee() {
		
		System.out.println("DAO: SalariedEmployeeDaoImpl saveEmployee by "+System.identityHashCode(this));
		
	}

}
