package com.cts.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cts.product.entity.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
	
	// DQL Domain Query Language
	
	public List<Product> findProductByPriceGreaterThanEqual(double price);
	
	// Query
	
	@Query(value = "from Product")
	List<Product> display();
	
	
	
	
 	
	
}
