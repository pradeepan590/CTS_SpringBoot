package com.cts.product.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.SessionScope;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Employee;

@Controller
@SessionAttributes(value = {"s1","u1"})
public class ProductController {
	
	@RequestMapping("/s1") // unique
	public void f1() {
		
		// 1. Model / Data
		// 2. View -> ModelAndView
		
		System.out.println(">>> f1 method got called...");
	}
	

	@RequestMapping("/s2") // unique
	public String f2(Model model) { // request
		model.addAttribute("userName", "Praveen");
		model.addAttribute("city", "Hyderabad");
		model.addAttribute("empNo", "345678");
		model.addAttribute("data","Hello");
		model.addAttribute("u1","Admin");


		System.out.println(">>> f2 method got called...");
		
		return "hello";
	}
	
	@RequestMapping("/s3")
	public String f3(Model model) {
		
		Employee e1=new Employee(10, "Praveen", 8767, LocalDate.of(2020, 1, 23));
		Employee e2=new Employee(11, "James", 45875, LocalDate.of(1987, 12, 12));
		Employee e3=new Employee(12, "Bucky", 937345, LocalDate.of(1982, 8, 18));
		Employee e4=new Employee(13, "Ozvitha", 263332, LocalDate.of(1978, 9, 8));
		Employee e5=new Employee(14, "Ella", 8457957, LocalDate.of(1992, 3, 15));

		List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5);
		
		model.addAttribute("employees",emps);
		
		return "display";
	}
	
	@RequestMapping("/s4")
	public ModelAndView f4() {
		
		ModelAndView mav=new ModelAndView("display");
		
		Employee e1=new Employee(10, "Praveen", 8767, LocalDate.of(2020, 1, 23));
		Employee e2=new Employee(11, "James", 45875, LocalDate.of(1987, 12, 12));
		Employee e3=new Employee(12, "Bucky", 937345, LocalDate.of(1982, 8, 18));
		Employee e4=new Employee(13, "Ozvitha", 263332, LocalDate.of(1978, 9, 8));
		Employee e5=new Employee(14, "Ella", 8457957, LocalDate.of(1992, 3, 15));
		Employee e6=new Employee(15, "Kavitha", 384738, LocalDate.of(1989, 9, 17));


		List<Employee> emps=Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		mav.addObject("employees",emps);
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
