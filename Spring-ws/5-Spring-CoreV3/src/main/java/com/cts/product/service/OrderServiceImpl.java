package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class OrderServiceImpl {
	
	public OrderServiceImpl() {
		System.out.println("OrderServiceImpl class object created..");
	}

}
