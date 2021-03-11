package com.cts.employee.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	 @Override
	public int getEmployeeCount() {
		 return 0;
	 }
	 
	 @Override
	public String getDeptInfo() {
		 return "IT";
	 }
	 
	 
		

}
