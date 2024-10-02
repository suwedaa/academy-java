package com.bptn.course._oop_demo;

class Cart {

	private CartItem[] items;
	private int itemCount;

	public Cart() {
		items = new CartItem[5];
		itemCount = 0;
	}
	//add products
	public void addProductToCart(Product product, int quantity) {
		if(itemCount <=4) {
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem; 
		itemCount++;
		product.reduceStock(quantity);
		} else { throw new IllegalArgumentException("Cart full!");}
	}
	
	//show products
	public CartItem[] showProductsInCart() {
		CartItem[] currentItems = new CartItem[itemCount]; 
		
		for (int i=0; i<itemCount; i++) {
			currentItems[i] = items[i]; 
		}
		return currentItems; 
	}
	
	

	
	
}
