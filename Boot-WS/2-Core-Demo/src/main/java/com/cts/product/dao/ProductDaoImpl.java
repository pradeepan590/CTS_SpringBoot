package com.cts.product.dao;

import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	public ProductDaoImpl() {
		System.out.println(">>> ProductDaoImpl object created..");
	}
	
	
	@Override
	public void save() {
		System.out.println("DAO::  Saving Product");
	}
}
