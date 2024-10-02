package com.bptn.course._oop_demo;

class CartItem {
		
		private Product product; //object of a data member of another class
		private int cartQuantity;
		
		public CartItem(Product product, int cartQuantity) {
			
			
			if(cartQuantity > product.getProductQuantity()) {
				
				throw new IllegalArgumentException("Insufficient Stock!");
			}
				this.product = product;
				this.cartQuantity = cartQuantity;
			
		}
		
		public Product getProduct() {
			return this.product;
		}
		
		public int getCartQuantity() {
			return this.cartQuantity; 
		}
		
		public double getTotalPrice() {
			return product.getproductPrice() * this.cartQuantity;
		}
	
		
		
		
		
}
