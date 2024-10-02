package com.bptn.course._oop_demo;

class Customer {
	private String  customerId;
	private String customerName; 
	private String customerEmail;
	private Cart cart; 
	
	public Customer(String customerId, String customerName, String customerEmail) {
		
		this.customerId = customerId; 
		this.customerName = customerName; 
		this.customerEmail = customerEmail;
		this.cart = new Cart(); 
	}
	
	public String getCustomerName() {
		return this.customerName; 
	}

	public Cart getCart() {
		return this.cart; 
	}

	public void checkout() {
		System.out.println("Processing order for: "+customerName); 
	}

	

}
