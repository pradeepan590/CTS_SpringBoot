package com.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.product.config.AppConfig;
import com.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		System.out.println("--- My APP");
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class); // IoC
		
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		ProductServiceImpl ps1 = ac.getBean(ProductServiceImpl.class);

		ps.f2();

	}

}
