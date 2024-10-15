package com.bptn.course.week3Challenge;

import java.util.ArrayList;
import java.util.List;

public class University {

	ArrayList<Student> students = new ArrayList<Student>();
	// property - get inspired by the UML diagram

	public void addStudent(Student s) {
		// add a student to the "university" arraylist
		students.add(s);
	}

	public Student getStudent(long studentId) {
		// get the first student in the university that has the studentId. (ideally,
		// this would be unique, so you can stop searching after finding the fist match)
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentId() == studentId) {
				return students.get(i);
			}
		}
		return null;

	}

	public List<Student> searchStudent(String userNamePrefix) {
		// return all students that have usernames beginning with the prefix
		List<Student> s = new ArrayList<Student>();
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getUserName().startsWith(userNamePrefix)) {
				s.add(students.get(i));

			}
		}
		return s;
	}

	public boolean deleteStudent(long studentId) {
		// return if a successful deletion happened
		for (int i = 0; i < students.size(); i++) {
			if (students.get(i).getStudentId() == (studentId)) {
				students.remove(i);
				return true;
			}
		}
		return false;
	}

}
