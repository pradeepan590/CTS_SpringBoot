package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		// ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductServiceImpl ps = context.getBean(ProductServiceImpl.class);
	}

}
