package com.bptn.course._04_arrays;

public class TwoDimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] grades = {
				{85,90,72},
				{88,92,94},
				{70,65,50}
		}; 
	//	System.out.print(grades[2][1]);

		for(int i=0; i<grades.length; i++) {
			int max=grades[i][0];
			for(int j=0; j<grades[i].length; j++) {
				if (grades[i][j] > max) {
					max = grades[i][j]; 
				}
			}
			System.out.println("Largest number is: " +max);
		}

		
		
		
		
		
		
		
		
		
	}

}
