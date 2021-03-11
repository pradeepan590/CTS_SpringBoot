package com.cts.product.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class AccountDaoImpl {
	
	public AccountDaoImpl() {
		System.out.println("AccountDaoImpl class object created...");
	}

}
