package com.cts.employee.dao;

import org.springframework.stereotype.Repository;

@Repository("contractEmpDao")
//Dependency 
public class ContractEmployeeDaoImpl implements EmployeeDao {

	public void saveEmployee() {
		
		System.out.println("DAO: ContractEmployeeImpl saveEmployee by "+System.identityHashCode(this));
	}

}
