package com.bptn.course._05_strings;
import java.util.Scanner;
public class StringPluralizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Number: ");
		int amt = scanner.nextInt();
		System.out.println("Word: "); 
		scanner.nextLine(); //this is so that you can skip the line and move to the next scan
		String word = scanner.nextLine(); 
		String newWord = word;
		
			
		if(word.endsWith("fe")){ 
			newWord = word.substring(0, word.length()-2) + "ves";
			//in this if, we check if fe is the end of the word, if it is, we take the word excluding the last two letters and add ves
		}
		
		else if(word.endsWith("ay") || word.endsWith("uy")||word.endsWith("oy")||word.endsWith("ey")) {
			newWord =  word + "s";	
			//since we only need to add an s, we check if it ends with the ending and just add s 
		}
			
		else if(word.endsWith("y")) {
			newWord =  word.substring(0, word.length()-1) + "ies";	
			//we remove the y and take the substring without the last letter (y) and add ies 
		}
		else if(word.endsWith("sh") || word.endsWith("ch")){
			newWord = word + "es"; 
			//same as ay case
		}
		
		else if(word.endsWith("us")){
			newWord = word.substring(0, word.length()-2) + "i"; 
			//take out last two letters and add i 
		}
		
		else { newWord = word + "s";}
		//otherwise, add s like most plurals 
	
		System.out.println( amt + " " + newWord);
		
		scanner.close(); 
	}

}
