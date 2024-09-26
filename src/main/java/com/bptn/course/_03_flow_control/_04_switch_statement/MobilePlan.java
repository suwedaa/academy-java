package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner; 

public class MobilePlan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
	    System.out.println("Welcome to the Mobile Data Plan Selector ");
	    System.out.println("Please select a mobile data plan: ");
		System.out.println(" ");
		System.out.println("1GB - $10"); 
		System.out.println("5GB - $10"); 
		System.out.println("Unlimited- $70"); 
		
		int plan = scanner.nextInt(); 
		switch(plan) {
		
		case 1: System.out.println("1GB - $10"); 
				break;
		case 2: System.out.println("5GB - $10"); 
				break;
		case 3: System.out.println("10GB - $10"); 
				break;
		case 4: System.out.println("Unlimited- $70"); 
				break;
		case 5: System.out.println("Exit"); 
				break;
		default: System.out.println("Invalid Plan");
		
		
		
		
		}
		scanner.close(); 

	}

}
