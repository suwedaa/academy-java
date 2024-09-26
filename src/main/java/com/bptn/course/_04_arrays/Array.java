package com.bptn.course._04_arrays;

public class Array {

	public static void main(String[] args) {
		  String[] names = {"Jamal", "Emily", "Destiny", "Mateo", "Sofia", "john", "amy"};
	        for (int i = 0; i < names.length; i++) {
	            System.out.println(names[i]);
	        }
	        int [] numbers = new int [] {10, 20, 30, 40}; 
	        for (int i=numbers.length; i>0; i--){
	            if (i % 2 == 1){
	            System.out.println(numbers[i]);}
	          }

	}
}
