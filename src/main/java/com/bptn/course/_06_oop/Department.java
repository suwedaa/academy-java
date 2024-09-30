package com.bptn.course._06_oop;

class Department {

	private String name;
	private int numOfEmployees; 
	
	public Department(String name, int numOfEmployees) {
		this.name = name;
		this.numOfEmployees = numOfEmployees;
	}

	public void showInfo() {
		System.out.println("DepartmentName: "+name + "NumberofEmployees: " + numOfEmployees);
	}
}
