package com.bptn.course._05_strings;
import java.util.Scanner; 
public class NumberGuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		int targetNumber = 23;
		int guess = 0;//taking my user's guess 
		
		while(true) {
			System.out.println("Enter a number between 1 and 100: ");
			guess = scanner.nextInt();
		if (guess <= 100 && guess>= 1) {
			//making sure that the guess is 1-100 inclusive
		
			if (guess > targetNumber) {
				System.out.println("Too high! Try again.");//checking if the guess is too high
			}
			
			else if(guess < targetNumber) { //here I am checking if the guess is too low 
				System.out.println("Too low! Try again.");
			}
			
			else {System.out.println("Congratulations! You guessed the number correctly!");
				  break;}
		}
			else {System.out.println("Please enter a number between 1 and 100.");}
		}
		scanner.close();
		
	}

}
