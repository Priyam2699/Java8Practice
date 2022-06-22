package com.learn.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

	}

	public static List<Student> sortStudentsByGpaAsc() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());

	}

	public static List<Student> sortStudentsByGpaDesc() {

		return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {

		System.out.println("Students sorted by Name: ");
		sortStudentsByName().forEach(System.out::println);

		System.out.println("\nStudents sorted by GPA Asc: ");
		sortStudentsByGpaAsc().forEach(System.out::println);

		System.out.println("\nStudents sorted by GPA Desc: ");
		sortStudentsByGpaDesc().forEach(System.out::println);

	}
}
