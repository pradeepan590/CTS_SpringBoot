package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductServiceImpl;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac= SpringApplication.run(Application.class, args);
		Product prod=new Product();
		prod.setName("iPhone 12 Pro Max");
		prod.setPrice(139000);
		prod.setDescription("256 GB");
		
		//ProductDao prodDao = ac.getBean(ProductDao.class);
		
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		
		//prodDao.save(prod);
		
	
		ps.filterProductByprice().forEach(product->{
			System.out.println(product.getId());
			System.out.println(product.getName());
			System.out.println(product.getPrice());
			System.out.println(product.getDescription());
			System.out.println("------------------------------");
		});
		
		
	}
	
	

}
