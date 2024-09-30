package com.bptn.course._03_flow_control._04_switch_statement;
import java.util.Scanner;
public class CalculatorMenu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
        //scanner object to take in input 
        boolean keepGoing = true; 
        //set boolean keepGoing as true for my while loop condition 
        
		
        do { 
        	 System.out.println("Calculator");
             System.out.println("Press 1 for addition");
             System.out.println("Press 2 for subtraction");
             System.out.println("Press 3 for multiplication");
             System.out.println("Press 4 for division");
             System.out.println("Press 5 to square a number");
             System.out.println("Press 6 to find a square root");
             System.out.println("Press 7 to find the reciprocal");
             int choice = scanner.nextInt(); 
             //Here i printed out my menu and I take in the choice through my method nextInt*()

            switch(choice){
            	//these are the cases, based on the choice user inputs
            case 1: 
            		System.out.print("Enter the first number: ");
	            	double firstNum = scanner.nextDouble(); 
	            	System.out.print("Enter the second number: ");//take firstNum for addition
	                double secondNum = scanner.nextDouble();//take secondNum for addition
            		double sum = firstNum + secondNum; //make sum variable for readability
            		System.out.println("The sum of the numbers " + firstNum+ " and " + secondNum+ " is = " + sum); 
            		break; //make sure to break after every case or else you wont be able to move on 

            case 2: //same as case one 
            		System.out.print("Enter the first number: ");
            		firstNum = scanner.nextDouble(); 
            		System.out.print("Enter the second number: ");
            		secondNum = scanner.nextDouble(); 
            		double difference = firstNum - secondNum; 
            		System.out.println("The differnece of the numbers " + firstNum+ " and " + secondNum+ " is = " + difference); 
            		break;
            case 3: //same as case one 
            		System.out.print("Enter the first number: ");
            		firstNum = scanner.nextDouble(); 
            		System.out.print("Enter the second number: ");
            		secondNum = scanner.nextDouble(); 
            		double product = firstNum * secondNum; 
            		System.out.println("The product of the numbers " + firstNum+ " and " + secondNum+ " is = " + product); 
            		break;
            case 4: 
            		System.out.print("Enter the first number: ");
	            	firstNum = scanner.nextDouble(); 
	            	System.out.print("Enter the second number: ");
	        		secondNum = scanner.nextDouble(); 
              //need to check if the secondNum is 0 becasue x/0 is undefined
	        		if (secondNum !=0) { 
	        		double quotient = firstNum / secondNum; 
	        		double remainder = firstNum % secondNum; //made seperate variable for remainder and quotient 
	        		System.out.println("Dividing " + firstNum+ " by " + secondNum+ " the quotient is " + quotient); 
	        		System.out.println("The remainder is " + remainder);} 
	        		else { System.out.println("Cannot divide anything by zero");} //let user know they cant divide by zero}
	        		break;

	          //same as case one
            case 5:  
            		System.out.print("Enter the number to find Square: ");
            		firstNum = scanner.nextDouble(); 
            		double square = firstNum * firstNum;
                System.out.println("The Square of the number " + firstNum+ " is = " + square);
                break;
        			
            case 6: 
            	System.out.print("Enter the number to find Square Root: ");
            	firstNum = scanner.nextDouble(); 
              if (firstNum >= 0) { //can't find square root of a NEGATIVE number! 
              double squareroot = Math.sqrt(firstNum);
              System.out.println("The SquareRoot of the number " + firstNum+ " is = " + squareroot);}
              else {System.out.println("Can't find square of a negative number.");} //letting the user know to re input }
              break;


        		//same as case 4, cant divide by zero
            case 7: 
            	System.out.print("Enter the number to find Reciprocal: ");
            	firstNum = scanner.nextDouble(); 
              if (firstNum !=0) {
              double recip = 1 / firstNum; 
              System.out.println("The Reciprocal of the number " + firstNum + " is = " + recip);}
              else { System.out.println("Cannot divide anything by zero");}
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
                keepGoing = false;
                //keepgoing will be false, therefore loop will end
              
            }


        } while(keepGoing);
        
        System.out.println("Bye!"); //saying bye (keepGoing is false and they decided to leave the calculator!) 
        scanner.close();

            
	}

}
