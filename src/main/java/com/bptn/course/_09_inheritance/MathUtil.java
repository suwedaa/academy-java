package com.bptn.course._09_inheritance;

public class MathUtil {
	
	
	static int counter = 0;
	// static dataType propertyName;
	static double valueOfPi = 3.14;
	 
	// static returnType methodName;
	 static int add(int a, int b) {
	  return a + b;
	 }
	 
	 static void addCount() {
		 counter++;
	 }
	 
	 public void displayData() {
	  System.out.print("This is not static");
	 }

}
