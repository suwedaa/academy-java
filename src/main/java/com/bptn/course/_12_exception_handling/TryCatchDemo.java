package com.bptn.course._12_exception_handling;

class TryCatchDemo {
	
	try {
		//cpde theat might throw an exception
		int result = 10/0;
	}
	catch(ArithmeticException e) {
		//code to handle the exception 
		System.out.println("Cannot divide by zero"); 
	}
	finally {
		//code that will always execute
		System.out.println("Period!"); 
	}
	
	double discount = 0; 
	double billAmount = 500;
	
	if (billAmount > 0 && billAmount > 100) {
		discount = 10 ;
	}
	else if(bill >200) {
		discount = 15;
			
	}
	else if (bill > 300) {
		
	}
	else {
			discount = 20;
		}

}
