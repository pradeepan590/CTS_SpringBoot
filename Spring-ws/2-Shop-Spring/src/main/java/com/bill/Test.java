package com.bill;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.AppConfig;


public class Test {

	public static void main(String[] args) {
		
		String[] cart1= {"Item01","Item02","Item02"};
		String[] cart2= {"Item01","Item02"};
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		BillingImpl biller = ac.getBean(BillingImpl.class);
		
	
		  
		double total= biller.getCartTotal(cart1);
		System.out.println("Cart1 total: "+total);
		
		total= biller.getCartTotal(cart2);
		System.out.println("Cart2 total: "+total);
		
	

	}

}
