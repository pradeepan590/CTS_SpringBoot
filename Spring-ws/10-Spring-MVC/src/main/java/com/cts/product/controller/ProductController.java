package com.cts.product.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	@RequestMapping("/s1") // unique
	public void f1() {
		
		// 1. Model / Data
		// 2. View -> ModelAndView
		
		System.out.println(">>> f1 method got called...");
	}
	

	@RequestMapping("/s2") // unique
	public String f2(Model model) {
		
		model.addAttribute("userName", "Praveen");
		model.addAttribute("city", "Hyderabad");
		model.addAttribute("empNo", "345678");
		
		
		
		System.out.println(">>> f2 method got called...");
		
		return "hello";
	}
	
	

}
