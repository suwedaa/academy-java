package com.bptn.course._oop_demo;

class Order {
	private Customer customer; 
	private CartItem[] items; 
	private double totalAmount;
	
	public Order(Customer customer) {
		this.customer = customer;
		this.items = customer.getCart().showProductsInCart(); 
		//this.totalAmount = customer.getCart().getTotalPrice();
	}
	
	public void placeOrder() {
		
		
		for(CartItem item : items) {
			System.out.println("\t"+item.getProduct().getProductName() + " - " + item.getCartQuantity());
		}
		System.out.println("Total Amount: $"+totalAmount);
		}
	
	



}
