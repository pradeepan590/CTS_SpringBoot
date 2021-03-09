package com.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

//@Component
@Service
//@Repository
//@Configuration
//@Controller
public class ProductServiceImpl {
	
	public ProductServiceImpl() {
		System.out.println("-- ProductServiceImpl object created... on "+System.identityHashCode(this));
	}

	public void f2() {
		
		System.out.println(">>>> ProductServiceImpl f2 method");
	}

	@Bean
	public void f1() {
		System.out.println(">>>> ProductServiceImpl f1 method");
	}

}
