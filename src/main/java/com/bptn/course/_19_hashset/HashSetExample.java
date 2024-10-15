package com.bptn.course._19_hashset;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> mySet = new HashSet<>();

		mySet.add("Toronto");
		mySet.add("Vancouver");
		mySet.add("Hamilton");

		System.out.println(mySet);

		System.out.println(mySet.contains("Toronto"));

		mySet.remove("Hamilton");
		System.out.println(mySet);

	}

}
