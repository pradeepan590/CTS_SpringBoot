package com.cts.product.entity;

import java.time.LocalDate;

public class Employee {

	private int empId;
	private String empName;
	private double salary;
	private LocalDate doj;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Employee(int empId, String empName, double salary, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.doj = doj;
	}



	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

}
