package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	
	
	@RequestMapping("/")
	public String welcome() {
		return "index";
	}
	
	@RequestMapping("/loadProdForm")
	public String loadProductForm() {
		return "product-form";
	}
	
	@RequestMapping("/loadProducts")
	public ModelAndView loadProducts() {
		ModelAndView mav=new ModelAndView("display");
		mav.addObject("products", productService.findAllProducts());
		return mav;
	}
	
	@RequestMapping("/saveProduct")
	public String savepProduct(@ModelAttribute Product prod) {
		
		productService.saveProduct(prod);
		
		return "redirect:/loadProducts";
	}
	
	
	

}
