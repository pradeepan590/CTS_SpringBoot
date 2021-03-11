package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.cts.product.service,com.cts.product.dao")
@Configuration
@ComponentScans(value = {@ComponentScan("com.cts.product"),@ComponentScan("com.cts.product.dao"),@ComponentScan("com.cts.product.service")})
public class AppConfig {

	public AppConfig() {
		System.out.println("-- AppConfig class object created....");
	}
	
	

}
