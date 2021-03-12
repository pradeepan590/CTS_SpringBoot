package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		Product prod=new Product();
		prod.setName("TV");
		prod.setPrice(67000);
		prod.setDescription("LG TV");
		
		// Create a service class and pass prod object to it to process saving to db
		
		ProductService prodService = ac.getBean(ProductService.class);
		
		//prodService.saveProduct(prod);
		
	
		
		
		
		
		
		
	
	
	}

}
