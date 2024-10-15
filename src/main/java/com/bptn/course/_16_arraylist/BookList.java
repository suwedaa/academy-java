package com.bptn.course._16_arraylist;
import java.util.*;

public class BookList {

	public static void main(String[] args) {
		
		ArrayList<String> books = new ArrayList<>();
		
		books.add("Beach Read");
		books.add("Powerless");
		books.add("The Selection"); 
		books.remove(1);
		System.out.println(books);
		
		System.out.println("First book: " + books.get(0));
		

	}

}
