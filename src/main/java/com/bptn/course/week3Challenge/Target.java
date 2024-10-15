package com.bptn.course.week3Challenge;

import java.util.ArrayList;

public class Target {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		int target = 9;
		nums.add(2);
		nums.add(7);
		nums.add(11);
		nums.add(15);

		for (int i = 0; i < nums.size(); i++) {
			for (int x = i + 1; x < nums.size(); x++) {
				if (nums.get(i) + nums.get(x) == target) {
					System.out.println("Indices are: [" + i + "," + x + "]");
				}
			}

		}

	}

}
