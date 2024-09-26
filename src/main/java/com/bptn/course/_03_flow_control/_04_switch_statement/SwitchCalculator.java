package com.bptn.course._03_flow_control._04_switch_statement;

import java.util.Scanner;



public class SwitchCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); 
		
		
		int choice;
		double menuTotal = 0.0;
		// TODO Auto-generated method stub
		//if you need to do one thing at least before doing a condition, then u should always do : do while in this condition 
	do {
		System.out.println("Welcome to the menu!");
		System.out.println("Please choose an item from the list: ");
		System.out.println("1. Pizza - $12.99");
		System.out.println("2. Burger - $8.99");
		System.out.println("3. Pasta - $9.99");
		System.out.println("4. Salad - $6.99");
		System.out.println("5. Exit");
		
		choice = scanner.nextInt(); 
		
		
		switch(choice) {
		
		case 1: System.out.println("You ordered Pizza!");
				menuTotal = menuTotal + 12.99;
				break;
		case 2: System.out.println("You ordered Burger!"); 
				menuTotal = menuTotal + 8.99;
				break;
		case 3: System.out.println("You ordered Pasta!"); 
				menuTotal = menuTotal + 9.99;
				break;
		case 4: System.out.println("You ordered Salad!"); 
				menuTotal = menuTotal + 6.99;
				break;
		case 5: System.out.println("Thank you for stopping by!"); 
		default: System.out.println("Invalid Choice"); 
		
		}
	} 
	while (choice !=5);
		scanner.close();
		
		
		System.out.println("Total is: " + menuTotal); 
	}

}
