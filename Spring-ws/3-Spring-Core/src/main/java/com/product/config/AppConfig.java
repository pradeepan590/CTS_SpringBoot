package com.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.product.service,com.product.dao")
public class AppConfig {

	public AppConfig() {
		System.out.println("-- AppConfig Object created..");
	}
	
	
	@Bean
	void f0() {
		System.out.println(">>>> AppConfig f0 method");
	}

}
