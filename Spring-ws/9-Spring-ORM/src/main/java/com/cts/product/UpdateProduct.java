package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class UpdateProduct {

	public static void main(String[] args) {
		
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService prodService = ac.getBean(ProductService.class);
		
		Product product=prodService.findProductById(16);
		
		product.setDescription("Ball Pen Blue Ink");
		product.setPrice(34.75);
		
		prodService.updateProduct(product);
		
		
		
	
		
		
		
		
		
		
	
	
	}

}
