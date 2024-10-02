package com.bptn.course._oop_demo;

class Product {
	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;
	
	
	public Product(String productId, String productName, double productPrice, int productQuantity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		
	}
	
	//Getters /Accessors 
	public String getProductId() {
		return this.productId;
	}
	public String getProductName() {
		return this.productName;
	}
	
	public double getproductPrice() {
		return this.productPrice;
	}
	
	public int getProductQuantity() {
		return this.productQuantity;
	}
	
	public void reduceStock(int quantity) {
		if(quantity <= productQuantity) {
			this.productQuantity -= quantity;
		}
		else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}
	
	public void restockProduct(int quantity) {
		if (quantity <= productQuantity) {
			productQuantity++;
		}
	}

}
