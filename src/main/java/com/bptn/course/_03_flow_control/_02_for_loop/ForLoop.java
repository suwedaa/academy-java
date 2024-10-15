package com.bptn.course._03_flow_control._02_for_loop;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 2 == 0) {
				System.out.print(" ," + i);
			}
		}

	}
}
