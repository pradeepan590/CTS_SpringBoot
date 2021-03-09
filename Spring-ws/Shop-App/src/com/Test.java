package com;

import com.bill.BillingImpl;
import com.pricematrix.PriceMatrixImpl;

public class Test {
	
	 static int count=1;
	 
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Test object is garbage collected... "+count++);
	}

	public static void main(String[] args) {
		
		String[] cart1= {"Item01","Item02","Item02"};
		String[] cart2= {"Item01","Item02"};
		
		
		//---------------------------------------------
		PriceMatrixImpl price=new PriceMatrixImpl();     // Dependency class object
		//----------------------------------------------
		
		BillingImpl biller=new BillingImpl(); // Dependent class object
		//BillingImpl biller1=new BillingImpl(); // Dependent class object

		
		//-----------------------------------
		  biller.setPrice(price); // DI: Injecting Dependency object (price) to the dependent object (biller)
		 // biller1.setPrice(price);
		  //------------------------------------
	
		  
		double total= biller.getCartTotal(cart1);
		System.out.println("Cart1 total: "+total);
		
		total= biller.getCartTotal(cart2);
		System.out.println("Cart2 total: "+total);
		
		
		Runtime rt=Runtime.getRuntime();
		System.out.println(rt.maxMemory());
		System.out.println(rt.freeMemory());
		
		
		
		for(long i=1;i<=100000;i++) {
			new Test();
		}
		System.gc();
		
		System.out.println((rt.maxMemory()-rt.freeMemory()));
		
		
		

	}

}
