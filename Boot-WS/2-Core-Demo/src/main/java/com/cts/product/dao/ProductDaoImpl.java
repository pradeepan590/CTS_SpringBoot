package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl {

	public ProductDaoImpl() {
		System.out.println(">>> ProductDaoImpl object created..");
	}
	
	
	public void save() {
		System.out.println("DAO::  Saving Product");
	}
}
