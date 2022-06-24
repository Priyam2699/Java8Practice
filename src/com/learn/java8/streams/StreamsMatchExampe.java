package com.learn.java8.streams;

import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsMatchExampe {

	public static boolean allMatch() {

		// allmatch() checks the condition for all stream objects
		return StudentDataBase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.9);
	}

	public static boolean anyMatch() {

		return StudentDataBase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 3.9);

	}

	public static boolean noneMatch() {

		return StudentDataBase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 3.9);
	}

	public static void main(String[] args) {

		System.out.println("Result of All Match: " + allMatch());
		System.out.println("Result of Any Match: " + anyMatch());
		System.out.println("Result of None Match: " + noneMatch());
	}

}
