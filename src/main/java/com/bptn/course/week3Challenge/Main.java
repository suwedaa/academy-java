package com.bptn.course.week3Challenge;

import java.util.Date;

public class Main {

	public static void main(String[] args) {

		// Start by looking in the University and Student classes. Implement the
		// methods.

		// Create a bunch of student objects
		// (Make sure one student has the following studentId: 123)
		// (Make sure one other student has the following username: testUsername1)
		Student student1 = new Student(123, "iamsasha", "pass1", "Sasha", "Green", "sasha_green@gmail.com", "416-123",
				"123 Pine St", "Female", new Date(), new Date(), 123, "Computer Science");

		Student student2 = new Student(456, "iamnick", "password456", "Nick", "Cole", "nick_cole@gmail.com", "416-456",
				"123 King St", "Male", new Date(), new Date(), 456, "Nursing");

		Student student3 = new Student(789, "iammack", "Mack", "Pi", "mack_pi@gmail.com", "416-789", "123 Queen St",
				"Male", null, new Date(), new Date(), 789, "Education");

		Student student4 = new Student(911, "iamana", "Ana", "Til", "ana_til@gmail.com", "416-911", "123 Church St",
				"Female", null, new Date(), new Date(), 911, "Nursing");

		Student editedStudent = new Student(123, "newUser", "newpass", "Sasha", "Green", "sasha_updated@gmail.com",
				"416-999", "456 Pine St", "Female", new Date(), new Date(), 123, "Computer Science");
		// Create instance of university called "university" and populate it with the
		// students.
		University university = new University();

		university.addStudent(student1);
		university.addStudent(student2);
		university.addStudent(student3);
		university.addStudent(student4);

		System.out.println("\nUniversity ------ \n" + university.students);
		System.out.println("\nGetting student------\n" + university.getStudent(123));
		System.out.println("\nDeleting student------\n" + university.deleteStudent(123));
		System.out.println("\nSeaching student------\n" + university.searchStudent("student"));
		student1.editStudent(university.students, editedStudent);
		System.out.println("\nUniversity ------ \n" + university.students);

	}

}
