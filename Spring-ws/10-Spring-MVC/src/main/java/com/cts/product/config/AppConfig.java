package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.product.dao,com.cts.product.service")
public class AppConfig {
	public AppConfig() {
		System.out.println(">>> AppConfig class object created...");
	}
	
	// data source
	@Bean
	public void getDataSource() {
		System.out.println("---- getDataSource method called...");
	}
	
	// session factory
	
	// transaction manager
	

}
