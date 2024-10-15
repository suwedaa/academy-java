package com.bptn.course._12_exception_handling;

class TryCatchDemo {
	{

		try {
			double discount = 0;
			double billAmount = 500;
			// cpde theat might throw an exception
			int result = 10 / 0;

			if (billAmount > 0 && billAmount > 100) {
				discount = 10;
			} else if (billAmount > 200) {
				discount = 15;

			} else if (billAmount > 300) {

			} else {
				discount = 20;

			}
		} catch (ArithmeticException e) {
			// code to handle the exception
			System.out.println("Cannot divide by zero");
		} finally {
			// code that will always execute
			System.out.println("Period!");
		}
	}
}
