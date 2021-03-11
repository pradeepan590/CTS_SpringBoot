package com.cts.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.employee.dao.ContractEmployeeDaoImpl;
import com.cts.employee.dao.EmployeeDao;
import com.cts.employee.dao.SalariedEmployeeDaoImpl;

@Service
//Dependent -> needs dao class object
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired // by type
	@Qualifier(value = "salariedEmpDao")
	private EmployeeDao empDao; // ref of dependency
	
	@Autowired // by type
	@Qualifier(value = "salariedEmpDao")
	private EmployeeDao empDao1; // ref of dependency

	/*
	 * //@Autowired // by constructor public EmployeeServiceImpl(EmployeeDao empDao)
	 * { this.empDao=empDao; }
	 */

	public void persistEmployee() {
		
		// salary calculations depends on type of object you ae calling

		if (empDao instanceof ContractEmployeeDaoImpl) {
			// salary calculation logic for ContractEmployee
			System.out.println("EmpDAO: "+empDao.getClass().getTypeName());
		}
		if (empDao instanceof SalariedEmployeeDaoImpl) {
			// salary calculation logic for SalariedEmployee

			System.out.println("EmpDAO: "+empDao.getClass().getTypeName());

		}

		empDao.saveEmployee();
		empDao1.saveEmployee();

		System.out.println("Service: Persisting Employee");
	}

}
