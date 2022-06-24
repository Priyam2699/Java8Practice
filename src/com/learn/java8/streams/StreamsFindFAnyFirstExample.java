package com.learn.java8.streams;

import java.util.Optional;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsFindFAnyFirstExample {

	public static Optional<Student> findAnyStudent() {

		Optional<Student> findAny = StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9)
				.findAny();
		return findAny;
	}

	public static Optional<Student> findFirstStudent() {

		Optional<Student> findFirst = StudentDataBase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9).findFirst();
		return findFirst;
	}

	public static void main(String[] args) {

		System.out.println();

		Optional<Student> stuOptional = findAnyStudent();

		if (stuOptional.isPresent()) {
			System.out.println("Found student : " + stuOptional.get());
		}

		else {

			System.out.println("Student not found");
		}

		Optional<Student> stuOptional2 = findFirstStudent();

		if (stuOptional2.isPresent()) {
			System.out.println("Found student : " + stuOptional2.get());
		}

		else {

			System.out.println("Student not found");
		}

	}
}
