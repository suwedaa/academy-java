package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner; 

public class VendingMachine {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		double choco = 2.5;
		double chips = 4.50;
		double pop = 3.60;
		double water = 2.25; 
		
		System.out.println("Welcome, what would you like from the veding machine? ");
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. Chocolate - $2");
		System.out.println("2. Chips- $4");
		System.out.println("3. Pop - $3");
		System.out.println("4. Water - $2");
		System.out.println("5. Exit");
		
		double change = 0.0;
		int choice = scanner.nextInt(); 
		System.out.println("Enter money now: ");
		double money = scanner.nextDouble(); 
		
		switch(choice) {
		
		case 1: System.out.println("Here is your chocolate!");
			if (money > choco) {
				change = money-choco; 
				System.out.println("Here is your change: "+change);}
			else {System.out.println("Insufficient funds, please try again: ");}
				break;
		case 2: System.out.println("Here is your chips!");
			if (money > chips) {
				change = money-chips;
				System.out.println("Here is your change: "+change);}
			else {System.out.println("Insufficient funds, please try again: ");}
				break;
		case 3: System.out.println("Here is your pop!"); 
				if (money > pop) {
				change = money-pop;
				System.out.println("Here is your change: "+change);}
				else {System.out.println("Insufficient funds, please try again: ");}
				break;
		case 4: System.out.println("Here is your water!"); 
				if (money > water) {
				change = money-water;
				System.out.println("Here is your change: "+change);}
				else {System.out.println("Insufficient funds, please try again: ");}
				break;
		case 5: System.out.println("Thank you for stopping by!"); 
		default: System.out.println("Invalid Choice"); 
		
		}
		scanner.close(); 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
