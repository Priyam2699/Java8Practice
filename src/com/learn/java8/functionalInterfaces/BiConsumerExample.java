package com.learn.java8.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void nameAndActivities() {

		List<Student> studenList = StudentDataBase.getAllStudents();

		BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out
				.println(name + " : " + activities);

		studenList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
	}

	public static void main(String[] args) {

		BiConsumer<String, String> biconsumer = (a, b) -> {

			System.out.println("Value of a is " + a + " Value of b is " + b);

		};

		// biconsumer.accept("Priyam", "Dua");

		BiConsumer<Integer, Integer> multiply = (a, b) -> {

			System.out.println("Multiplication of Two number is " + (a * b));

		};

		multiply.accept(5, 7);

		BiConsumer<Integer, Integer> division = (a, b) -> {

			System.out.println("Division of Two number is " + (a / b));

		};

		division.accept(10, 2);

		multiply.andThen(division).accept(10, 5);

		nameAndActivities();
	}

}
