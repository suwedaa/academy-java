package com.bptn.course._21_puttingTogetherEverything;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskManager {

	public static void main(String[] args) {

		// Create a new LinkedList called "tasks

		LinkedList<String> tasks = new LinkedList<>();

		// Create a new hashSet for storing completed tasks

		HashSet<String> completed = new HashSet<>();

		// Create a scanner
		Scanner scanner = new Scanner(System.in);

		// Store user's input
		int choice;

		do {
			System.out.println("\n========Task Management System==========");
			System.out.println("1. Add task");
			System.out.println("2. Mark as Complete");
			System.out.println("3. View Pending Task");
			System.out.println("4. View Completed Task");
			System.out.println("5. Exit");

			choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:

				System.out.println("Add new task:");
				String task = scanner.nextLine();
				tasks.add(task);
				System.out.println("Task Added!");
				break;
			case 2:
				if (tasks.isEmpty()) {
					System.out.println("No tasks found!");
				} else {
					System.out.println("Pick a task to mark it as complete");

					Iterator<String> it = tasks.iterator();

					int count = 1;
					while (it.hasNext()) {
						System.out.println(count + "-" + it.next());
						count++;
					}
					int taskNumber = scanner.nextInt();

					completed.add(tasks.get(taskNumber - 1));
					System.out.println("Marked as Completed.");
					tasks.remove(taskNumber - 1);
				}
				break;

			case 3:
				System.out.println("Pending tasks");
				if (tasks.isEmpty()) {
					System.out.println("No pending tasks");
				} else {
					for (String t : tasks)
						System.out.println(t);
				}
				break;

			case 4:
				if (completed.isEmpty()) {
					System.out.println("No completed tasks");
				} else {
					for (String t : completed) {
						System.out.println(t);
					}
				}
				break;

			}

		} while (choice != 5);
		scanner.close();

	}
}
