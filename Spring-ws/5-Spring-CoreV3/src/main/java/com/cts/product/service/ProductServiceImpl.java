package com.cts.product.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;

@Service(value = "prodService")
//@Service
public class ProductServiceImpl {
	
	

	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl object created on hashcode: " + this.hashCode());
	}

	public void saveProduct(Product product) {

		System.out.println("Saving Product "+product.getName());
	}

	public List<Object> findAllProducts() {
		System.out.println("Finding all products");
		return null;
	}

}
