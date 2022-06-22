package com.learn.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsExample {

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		Predicate<Student> stPredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> stGPAPredicate = student -> student.getGpa() >= 3.9;

		Map<String, List<String>> studentMap = allStudents.stream().filter(stPredicate).filter(stGPAPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentMap);

	}

}
