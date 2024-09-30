package com.bptn.course._02_scanner;

import java.util.Scanner; 

public class Scan {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name: ");
		
		String name = scanner.nextLine(); 
		
		System.out.println("Name: " + name);
		
		scanner.close();
	}
}