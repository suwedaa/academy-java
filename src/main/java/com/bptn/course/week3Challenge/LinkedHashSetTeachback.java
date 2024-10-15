package com.bptn.course.week3Challenge;

import java.util.LinkedHashSet;

public class LinkedHashSetTeachback {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");

		for (String s : set) {
			System.out.println(s);
		}

		set.remove("B");
		System.out.println("Set without 'B'");
		System.out.println(set);

	}

}
