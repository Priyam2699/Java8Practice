package com.learn.java8.methodreference;

import java.util.function.Consumer;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListActivities;

	public static void main(String[] args) {

		StudentDataBase.getAllStudents().forEach(c1);

		StudentDataBase.getAllStudents().forEach(c2);

	}

}
