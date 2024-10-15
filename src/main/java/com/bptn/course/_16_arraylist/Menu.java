package com.bptn.course._16_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<String> itemList = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
			// Display menu options
			System.out.println("\nMenu:");
			System.out.println("1. Add item");
			System.out.println("2. Get item");
			System.out.println("3. Remove item");
			System.out.println("4. Update item");
			System.out.println("5. Search item");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");

			choice = scanner.nextInt();
			scanner.nextLine(); // Consume newline left-over from nextInt()

			switch (choice) {
			case 1: // Get item
				System.out.print("Enter item to add: ");
				String newItem = scanner.nextLine();
				itemList.add(newItem);
				System.out.println("Item added!");
				break;

			case 2: // Add item
				System.out.print("Enter index of item to get: ");
				int indexToGet = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				if (indexToGet >= 0 && indexToGet < itemList.size()) {
					System.out.println("Item at index " + indexToGet + ": " + itemList.get(indexToGet));
				} else {
					System.out.println("Invalid index!");
				}

				System.out.print("Enter item to add: ");
				String newItem1 = scanner.nextLine();
				itemList.add(newItem1);
				System.out.println("Item added!");
				break;

			case 3: // Remove item
				System.out.print("Enter index of item to remove: ");
				int indexToRemove = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				if (indexToRemove >= 0 && indexToRemove < itemList.size()) {
					itemList.remove(indexToRemove);
					System.out.println("Item removed!");
				} else {
					System.out.println("Invalid index!");
				}
				break;

			case 4: // Update item
				System.out.print("Enter index of item to update: ");
				int indexToUpdate = scanner.nextInt();
				scanner.nextLine(); // Consume newline
				if (indexToUpdate >= 0 && indexToUpdate < itemList.size()) {
					System.out.print("Enter new item: ");
					String updatedItem = scanner.nextLine();
					itemList.set(indexToUpdate, updatedItem);
					System.out.println("Item updated!");
				} else {
					System.out.println("Invalid index!");
				}
				break;

			case 5: // Search item
				System.out.print("Enter item to search for: ");
				String searchItem = scanner.nextLine();
				if (itemList.contains(searchItem)) {
					System.out.println("Item found at index: " + itemList.indexOf(searchItem));
				} else {
					System.out.println("Item not found!");
				}
				break;

			case 6: // Exit
				System.out.println("Exiting program.");
				break;

			default:
				System.out.println("Invalid choice! Please choose a valid option.");
			}
		} while (choice != 6); // Keep showing menu until user chooses to exit

		scanner.close();
	}
}
