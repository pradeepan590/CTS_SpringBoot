package com.pricematrix;

import org.springframework.stereotype.Repository;

@Repository
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl class object created...");
	}
	
	
	public double getItemPrice(String itemCode) {

		// code for fetch price of a given item-code from database

		return 100.0;
	}

}
