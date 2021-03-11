package com.cts.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
@Scope("singleton")
public class ProductServiceImpl {

	@Bean // invokes only one time on same object
	public void f2() {
		System.out.println(">>>>>>> f2 method of ProductServiceImpl class");
	}

	public ProductServiceImpl() { // invokes only one time on same object
		System.out.println("ProductServiceImpl object created on " + this.hashCode());
	}

	public void f1() {
		System.out.println("ProductServiceImpl f1 method on " + this.hashCode());
	}

}
