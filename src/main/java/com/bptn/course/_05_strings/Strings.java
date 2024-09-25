package com.bptn.course._05_strings;
import java.util.Scanner; 

public class Strings {

	public static void main(String[] args) {
		
		/*String userName = "testuser"; 
		System.out.println(userName.length()); 
		System.out.println(userName.charAt(2)); 
		System.out.println(userName.substring(4)); 
		System.out.println(userName.substring(2,4));
		System.out.println(userName.equals("testuser")); */
	
		System.out.println("Enter a string: ");
		Scanner scanner = new Scanner(System.in); 
		String input = scanner.nextLine();
		String lowercase = input.toLowerCase(); 
		int vowcount = 0;
		int constcount = 0;
		
		for (int i=0; i<= lowercase.length()-1; i++) {
			char letter = lowercase.charAt(i); 
			if (letter == 'a' || letter== 'e' || letter== 'i' || letter == 'o' || letter== 'u') {
				vowcount++ ; 
			}
			else if (letter>= 'a' && letter<= 'z') {
				constcount++;
			}
		}
		System.out.println("Number of Vowels " + vowcount + " Number of Constants: " + constcount); 
		 
	scanner.close();
	}
}
