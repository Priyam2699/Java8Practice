package com.learn.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class ParallelStreamExampleLab {

	public static List<String> sequentialprintStudentActivities() {

		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().map(Student::getActivities)
				.flatMap(List<String>::stream).distinct().sorted().collect(Collectors.toList());

		long endTime = System.currentTimeMillis();

		System.out.println("Duration to execute the pipeline in sequential manner: " + (endTime - startTime));
		return studentActivities;
	}

	public static List<String> parallelprintStudentActivities() {

		long startTime = System.currentTimeMillis();
		List<String> studentActivities = StudentDataBase.getAllStudents().stream().parallel()
				.map(Student::getActivities).flatMap(List<String>::stream).distinct().sorted()
				.collect(Collectors.toList());

		long endTime = System.currentTimeMillis();

		System.out.println("Duration to execute the pipeline in parallel manner: " + (endTime - startTime));
		return studentActivities;
	}

	public static void main(String[] args) {

		System.out.println("PrintStudentSctivities :" + sequentialprintStudentActivities());
		System.out.println("PrintStudentSctivities :" + parallelprintStudentActivities());

	}

}
