package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service(value = "accService")
@Lazy
public class AccountsServiceImpl {

	public AccountsServiceImpl() {
		System.out.println("AccountsServiceImpl class object created..");
	}

}
