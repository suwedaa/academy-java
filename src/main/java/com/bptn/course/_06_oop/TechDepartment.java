package com.bptn.course._06_oop;

class TechDepartment extends Department {
	
private double totalPurchaseAmount; 
	
	public TechDepartment(String name, int numOfEmployees, double totalPurchaseAmount) {
		
		super(name, numOfEmployees);
		this.totalPurchaseAmount = totalPurchaseAmount; 
	}
	

}
