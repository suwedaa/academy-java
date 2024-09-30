package com.bptn.course._05_strings;
import java.util.Scanner;
public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
        //scanner object to take in input 
        boolean keepGoing = true; 
        //set boolean keepGoing as true for my while loop condition 
        
		
        do { 
        	 System.out.println("/…String Menu…/");
             System.out.println("Press 1 for Palindrome Check");
             System.out.println("Press 2 to reverse a String");
             System.out.println("Press 3 to Concatenate two Strings");
             System.out.println("Press 4 for String Comparison");
             System.out.println("Press 5 to Caclulate Length");
             System.out.println("Enter the option: ");
            
             int choice = scanner.nextInt(); 
             scanner.nextLine();
             //Here i printed out my menu and I take in the choice through my method nextInt*()

            switch(choice){
            
            case 1: 
            	System.out.println("Palindrome Check");
            	System.out.println("Enter a string: ");
            	String string = scanner.nextLine();
            	String reverse = ""; //start with initializing an empty string
            	for (int i = string.length()-1; i>=0; i--) { //this for loop starts at the end of the string and moves up the string
            		reverse = reverse + string.charAt(i); 
            		//here we are adding each character, starting at the end of the string to String reverse 
            	}
            	if(string.toLowerCase().equals(reverse.toLowerCase())) {
            		//here we check if they both are equal to each other
            		//I use toLowerCase to make sure that they are the same case 
            		System.out.println(string + " is a palindrome"); 
            	}
            	else {System.out.println(string + " is not a palindrome");}
            	break;
            	
            case 2: 
            	System.out.println("Reversed String");
            	System.out.println("Enter a string: ");
            	string = scanner.nextLine();
            	reverse = ""; 
            	for (int i = string.length()-1; i>=0; i--) {
            		//this for loop is the same as the palindrome
            		reverse = reverse + string.charAt(i); 
            	}
            	System.out.println(reverse + " is " + string + " in reverse "); 
            	break;
            	
            case 3: 
            	System.out.println("Enter First string: ");
            	string = scanner.nextLine();
            	System.out.println("Enter Second string: "); 
            	String string2 = scanner.nextLine();
            	String combined = string + string2; //you can concatenate two strings by simply adding them
            
            	System.out.println(combined); 
            	break;
            	
            case 4: 
            	System.out.println("String Comparison");
            	System.out.println("Enter First string: ");
            	string = scanner.nextLine();
            	System.out.println("Enter Second string: "); 
            	string2 = scanner.nextLine();
            	if (string.equals(string2)) {
            		//use method .equals to compare string type
            		System.out.println("The entered strings are equal"); }
            	else {System.out.println("The entered strings are not equal");}
            	break;
            	
            case 5: 
            	System.out.println("Length of a String");
            	System.out.println("Enter a string: ");
            	string = scanner.nextLine();
            	int length = string.length();
            	//using length method to find string length 
            	System.out.println("The length of the entered string is: " + length); 
            	break;
            	
            default: 
        		System.out.println("Invalid choice! Please make a valid choice.");
               //default statement let's them know they cant divide by zero
        		break;
          }
	
        
            System.out.println("To continue calculation Press 1, else press any other number to exit");
            //printing this inside the loop to let user know to contnue otherwise keepGoing will be set to false and program will terminate
            int userResponse = scanner.nextInt(); //checking what the user inserted 
            if (userResponse != 1) { //user presses something other than 1
                keepGoing = false;}
        
        }while (keepGoing); 
        
        System.out.println("Bye :) "); 
	scanner.close(); 
	
	
	
	
	
	
	
	
	}

}
