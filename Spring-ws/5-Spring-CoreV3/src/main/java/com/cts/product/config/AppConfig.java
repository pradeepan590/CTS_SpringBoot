package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao")
@Lazy
public class AppConfig {
	
	// Database configurations etc
	
	
	

}
