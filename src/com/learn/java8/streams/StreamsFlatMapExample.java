package com.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {

		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List<String>::stream).collect(Collectors.toList());

		return studentActivities;
	}

	public static void main(String[] args) {

		System.out.println("PrintStudentSctivities :" + printStudentActivities());

	}

}
