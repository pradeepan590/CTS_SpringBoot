package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		

		// ProductServiceImpl ps= (ProductServiceImpl) ac.getBean("prodService");
		// ProductServiceImpl ps= (ProductServiceImpl) ac.getBean("productServiceImpl");
		   ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		  // AccountDaoImpl accDao = ac.getBean(AccountDaoImpl.class);
		   

		   Product p1=new Product();
		   p1.setId(10);
		   p1.setName("Laptop");
		   p1.setPrice(150000);
		   p1.setDescription("Mac Book Air");
		   
		   ps.saveProduct(p1);
		
		   ps.findAllProducts();
		
		

	}

}
