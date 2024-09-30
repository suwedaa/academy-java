package com.bptn.course._06_oop;

public class BankSystem {

	public static void main(String[] args) {
		
		BankAccount testAccount = new BankAccount("987654", 1200.00);
		testAccount.displayAccountInfo(); 
		
		BankAccount newTestAccount = new BankAccount("123456", 600.00); 
		newTestAccount.displayAccountInfo();
		
		SavingsAccount myAccount = new SavingsAccount("SAVINGS123", 500.00, 1.0);
		myAccount.applyInterest();
		myAccount.displayAccountInfo();
		
		
		ChequingAccount myChequingAccount = new ChequingAccount("CHEQUING123", 500, 300);
		myChequingAccount.withdraw(400); 
		myChequingAccount.displayAccountInfo();
	}

}
