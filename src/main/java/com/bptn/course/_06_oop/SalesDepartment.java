package com.bptn.course._06_oop;

class SalesDepartment extends Department {
	
	private double totalSalesAmount; 
	
	public SalesDepartment(String name, int numOfEmployees, double totalSalesAmount) {
		
		super(name, numOfEmployees);
		this.totalSalesAmount = totalSalesAmount;
	}

}

