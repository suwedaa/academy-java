package com.bptn.course._03_flow_control._02_for_loop;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// DO WHILE
		int counter = 0;

		do {

			System.out.println(counter);
			counter = counter + 1;

		} while (counter < 20);

		// WHILE LOOP
		boolean isBlue = true;
		String sky = "purple";

		while (isBlue) {

			if (sky.equals("blue")) {
				isBlue = true;
				System.out.println("The sky is blue.");
				break;
			} else {
				isBlue = false;
				System.out.println("The sky is purple.");
				break;
			}
		}

		// For loop
		String hello = "hello";
		// int length = hello.length();

		for (int i = 0; i < hello.length(); i++) {

			System.out.print(i); // indexes
			System.out.println(hello.charAt(i)); // each letter

			// Output : 0, 1, 2, 3,

		}

		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
			if (i % 2 == 0) {
				System.out.print(" - even");
			}
			System.out.println();
		}
		System.out.print("We love to print lines.");

	}

}
