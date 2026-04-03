package com.student;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] students = { 
				new Student(1, "Gauri", "Pune", 93.0),
				new Student(2, "Sumit", "Bilaspur", 95.5), 
				new Student(3, "Snehal", "Amravati", 85.5),
				new Student(4, "Garv", "Indore", 92.0) ,
				new Student(5, "Vaishnavi", "Pune", 92.0) 
				};

		Arrays.sort(students, new studentComparator());

		for (Student student : students) {
			System.out.println(student);
		}
	}
}