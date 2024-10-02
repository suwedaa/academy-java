package com.bptn.course._08_oop_demo;

public class ShoppingCartApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product("P001", "Laptop", 2500, 30); 
		Product p2 = new Product("P002", "Iphone", 1900, 10); 
		Product p3 = new Product("P003", "Watch", 600, 28); 
		
		
		Customer customer = new Customer("C001", "Alice", "alice@gmail.com");
		
		customer.getCart().addProductToCart(p1, 2);
		customer.getCart().addProductToCart(p2, 3);
		customer.getCart().addProductToCart(p3, 4);
		
		customer.checkout(); 
		
		Order order = new Order(customer); 
		order.placeOrder();
		

	}

}
