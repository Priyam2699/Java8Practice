package com.learn.java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

	Predicate<Student> p1 = s -> s.getGradeLevel() >= 3;
	Predicate<Student> p2 = s -> s.getGpa() >= 3.9;

	BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out
			.println(name + " : " + activities);

	Consumer<Student> stduentConsumer = student -> {

		if (p1.and(p2).test(student)) {

			studentBiConsumer.accept(student.getName(), student.getActivities());

		}

	};

	public void predicateNameAndActivities(List<Student> students) {

		students.forEach(stduentConsumer);

	}

	public static void main(String[] args) {

		List<Student> studentList = StudentDataBase.getAllStudents();

		new PredicateAndConsumerExample().predicateNameAndActivities(studentList);

	}

}