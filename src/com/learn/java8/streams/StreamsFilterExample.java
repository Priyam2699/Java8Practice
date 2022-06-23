package com.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> filterStudents() {

		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGender().equals("female")).filter(student->student.getGpa()>3.9)
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {

		filterStudents().forEach(System.out::println);
		;

	}

}
