package com.bptn.course._12_exception_handling;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//int[] numbers = {0, 2, 3, 4, 5};
		Scanner scanner = new Scanner(System.in); 
		System.out.println("How many elements do you want in the array? ");
		int count = scanner.nextInt(); 
		int [] numbers = new int[count]; 
		
		
		System.out.println("Enter " + count + " numbers for your array");
		
		for(int i = 0; i <count; i++) {
			numbers[i]=scanner.nextInt();
		}
		
		System.out.println("Enter two numbers for division ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		try {
			//cpde theat might throw an exception
			int result = num1/num2;
			System.out.println("Result: "+ result);
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter valid numbers!");
		}
		catch(ArithmeticException e) {
			//code to handle the exception 
			System.out.println("Cannot divide by zero"); 
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("The array contains: " + numbers.length + "items");
		}
		
		finally {
			//code that will always execute
			System.out.println("Bye!"); 
		}
		scanner.close();
	}
	


}
