package com.learn.java8.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class DefaultsMethodsExample2 {

	static Consumer<Student> s = (s) -> System.out.println(s);
	static Comparator<Student> nameComparator = Comparator.comparing(Student::getGradeLevel);

	public static void sortByName(List<Student> studentList) {

		studentList.sort(nameComparator);

		studentList.forEach(s);
	}

	public static void sortWithNullValues(List<Student> students) {

		Comparator<Student> nullsFirst = Comparator.nullsLast(nameComparator);

		students.sort(nullsFirst);
		students.forEach(s);

	}

	public static void main(String[] args) {

		List<Student> allStudents = StudentDataBase.getAllStudents();

		// System.out.println(allStudents);

		// allStudents.forEach(s);

		// sortByName(allStudents);

		sortWithNullValues(allStudents);

	}

}
