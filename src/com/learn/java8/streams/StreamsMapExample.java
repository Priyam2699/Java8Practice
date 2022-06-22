package com.learn.java8.streams;

import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsMapExample {

	public static Set<String> namesSet() {
		// map is transforming the student objects to the corresponding names
		// second map is performing a operation on each input
		// collect method is used to collect the stream generated from map and collects
		// it in a collections
		Set<String> studentSet = StudentDataBase.getAllStudents().stream().map(Student::getName)
				.map(String::toUpperCase).collect(Collectors.toSet());

		return studentSet;
	}

	public static void main(String[] args) {

		System.out.println(namesSet());

	}

}
