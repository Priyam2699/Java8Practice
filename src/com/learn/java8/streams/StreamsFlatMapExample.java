package com.learn.java8.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsFlatMapExample {

	public static List<String> printStudentActivities() {

		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List<String>::stream).distinct().sorted().collect(Collectors.toList());

		return studentActivities;
	}

	public static long printStudentActivitiesCount() {

		long numberOfStudentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List<String>::stream).distinct().count();

		return numberOfStudentActivities;
	}

	public static void main(String[] args) {

		System.out.println("PrintStudentSctivities :" + printStudentActivities());
		System.out.println("Total number of student activities: " + printStudentActivitiesCount());

	}

}
