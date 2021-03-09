package com.pricematrix;

// Dependency
public class PriceMatrixImpl {
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl class object created...");
	}
	
	/*
	 * Types of Objects: 2 types
	 * 
	 * -> Dependency: Works independently. Never depends on other objects. ->
	 * -> Dependent : Always depends on dependency objects
	 * 
	 * Good Quality code tips
	 * 1. Never try to create any class object with in method level.
	 * 
	 * 
	 * 
	 *          A - dependency
	 *          B - dependency .. 
	 *          C - dependency
	 *          
	 *          -----------------
	 *          D is using A -> D is called Dependent 
	 *          E is Using B -> E is called Dependent
	 *          B is Using A -> B is called Dependent only for class A
	 *          
	 *          
	 *          
	 *          
	 *          
	 * 
	 */

	public double getItemPrice(String itemCode) {

		// code for fetch price of a given item-code from database

		return 100.0;
	}

}
