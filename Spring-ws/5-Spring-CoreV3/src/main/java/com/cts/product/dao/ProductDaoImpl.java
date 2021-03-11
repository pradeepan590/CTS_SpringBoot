package com.cts.product.dao;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Repository;

@Repository
@Lazy
public class ProductDaoImpl {
	
	public ProductDaoImpl() {
		System.out.println("ProductDaoImpl class object created...");
	}
	
	

}
