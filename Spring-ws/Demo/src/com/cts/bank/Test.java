package com.cts.bank;

public class Test {
	public static void main(String[] args) {
		
		
		Customer cust=new BankDaoImpl();
		cust.deposit(100);
		cust.withDraw(67);
		
		Manager m=new BankDaoImpl();
		m.openLocker();
		
		Admin a=new BankDaoImpl();
		a.resetPasswords();
		
		Cleark c=new BankDaoImpl();
		c.clearkOperations();
		
		
		
		
		
		
	}

}
