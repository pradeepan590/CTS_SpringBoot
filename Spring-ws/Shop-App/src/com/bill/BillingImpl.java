package com.bill;

import com.pricematrix.PriceMatrixImpl;

//Dependent
public class BillingImpl {
	
	private PriceMatrixImpl price; // Dependency class reference object
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}
	

	/*
	 * ---------------------
	 * 	Design Issues
	 * ---------------------
	 * 
	 *  -> Too many dependency class objects creations. 
	 *  		-> per of apply goes down
	 *  		-> issues like memory management
	 *  
	 * 
	 *  Why this issue happened?
	 *  ----------------------------
	 *  -> Dependent class itself creating dependency class object directly.
	 *  
	 *  What is the solution?
	 *  -----------------------
	 *  -> Never create dependency object in the dependent class.
	 *  -> Instead, use technique like JNDI (Java Naming Directory interface)
	 *  -> The location of JNDI is tightly coupled with dependent class.
	 *  
	 *  What is the best solution?
	 *  ------------------------------
	 *  -> Do not create/find or look-up, instead ask some one (container) to inject dependency object: IoC(Inversion of control)
	 *  
	 *  How Ioc can be implemented?
	 *  -------------------------------
	 *  -> using Dependency injection technique
	 *  
	 *  What is Dependency Injection (DI)?
	 *  -------------------------------
	 *  -> Injecting / passing a dependency object to the dependent object is called DI
	 *  
	 *  Who needs whom?
	 *  ------------------
	 *  -> Dependents always needs dependencies -> need to pass dependencies to the dependent objects all the time.
	 *  
	 *  In how many ways DI can be implemented? : 2 ways
	 *  ---------------------------------------------------
	 *  way - 1 : using setter based injection : can be injected more than one time on top of same object
	 *  	rules
	 *  	-------
	 *  	-> define dependency class reference at class level.
	 *  	-> create setter for the above defined dependency property
	 *  
	 *  way - 2 : using constructor based injection : can be injected only one time in life cycle on top of same object
	 *  
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	


	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl(); // Dependency

		for (String itemCode : cart) {

			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}
}
