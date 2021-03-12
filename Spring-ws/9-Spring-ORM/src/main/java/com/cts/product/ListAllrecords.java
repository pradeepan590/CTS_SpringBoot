package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class ListAllrecords {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		
		ProductService prodService = ac.getBean(ProductService.class);
		

		prodService.findAllProducts().forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("------------------------------");
		});
	
		
		
		
		
		
		
	
	
	}

}
