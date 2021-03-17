package com.cts.product.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.model.Product;

@RestController
@RequestMapping("/api/products")
@CrossOrigin
public class ProductRestController {
	
	@GetMapping
	public String f1() {
		return "GET Mapping method";
	}
	

	@GetMapping("/list")
	public Product f8(@RequestBody Product product) {
		System.out.println(">>>>>>>>>> listing <<<<<<<");
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDescription());
		return product;
	}
	
	@GetMapping("/v1")
	public String f6() {
		return "Get Mapping V1";
	}
	
	@GetMapping("/v7")
	public String f9(@RequestParam String store) {
		return "Get Mapping V7 store name "+store;
	}
	
	@GetMapping("/v1/{id}")
	public String f7(@PathVariable int id) {
		return "Get Mapping V1 id is "+id;
	}
	
	@PostMapping
	public String f2() {
		return "POST Mapping method";
	}
	
	@PostMapping("/{id}/{name}/{price}/{description}")
	public String f8(
			@PathVariable int id,
			@PathVariable String name,
			@PathVariable double price,
			@PathVariable("description") String desc) {
		
		return "POST Mapping method "+id+" "+name+" "+price+" "+desc;
	}
	
	
	@PostMapping("/save")
	public Product save(@RequestBody Product product) {
		
		System.out.println(product.getId());
		System.out.println(product.getName());
		System.out.println(product.getPrice());
		System.out.println(product.getDescription());
		
		if(product.getHobbies().length!=0) {
			for(String hobby:product.getHobbies()) {
			System.out.println(hobby);	
			}
		}
		
		return product;
	}
	
	@PutMapping
	public String f3() {
		return "PUT Mapping method";
	}
	
	@PatchMapping
	public String f4() {
		return "PATCH Mapping method";
	}
	
	@DeleteMapping
	public String f5() {
		
		
		return "DELETE Mapping method";
	}
	
	
	
	
	
	
	
	
	

}
