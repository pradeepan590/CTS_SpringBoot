package com.cts.product.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Lazy
@Repository
public class OrderDaoImpl {
	
	public OrderDaoImpl() {
		System.out.println("OrderDaoImpl class object created...");
	}

}
