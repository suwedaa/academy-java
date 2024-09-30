package com.bptn.course._05_strings;
import java.util.Scanner;
public class EncryptedPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Give me a word: "); 
		  Scanner scanner = new Scanner(System.in);
          String word = scanner.nextLine(); //word is used to get the input from the scanner 
          String encrypt= ""; //here is my empty string to add to 
          for (int i=0; i<word.length(); i++){
        	  //my for loop starts at the first letter and iterates through length of the string
        	  char character = word.charAt(i);
        	  //I am setting character to each letter in the word
        	 if (Character.isLetter(character)){
        		 //I have to check if it is a letter first before I increment 
        		 //This is because Z will become [ and we don't want that.
	        	  
	        	  
	        	  if (character == 'z' && Character.isLowerCase(character)) {
	        		  character = 'a';
	        		  //if character is z make it a instead of { 
	        	  }
	        	  else if (character =='Z' && Character.isUpperCase(character)){
	        		  character = 'A'; 
	        		  //if character is Z, make it A instead of [
	        	  }
	        	  else { character++;} //otherwise, incremently normal i.e a --> b
	        	  
	        	  
	        	  
	        	  encrypt = encrypt + character;
	        	  //add character to the string! 
	        	 }
        	 else { 
        	
        		 encrypt = encrypt + character;
        		 //THIS IS FOR NON-CHARACTERS, ADD REGULARLY} 
          }
        }
          System.out.println("Encrypted word: " + encrypt); 
          scanner.close(); 


	}

}
