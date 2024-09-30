package com.bptn.course._06_oop;

class BankAccount {

	//Data Members / Properties 
	private String accountNumber;
	private double balance;
	
	//Constructor 
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}

	//Instance Method, Class Method, Behaviour 
	public void deposit(double amount) {
		if(amount>0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount <= balance) {
			balance -= amount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("AccountNumber: " + accountNumber); 
		System.out.println("Balance: " + balance); 
	}
	
	
	
	
}



