package com.learn.java8.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.learn.java8.functionalInterfaces.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> studentSupplier = Student::new;

	static Function<String, Student> stueFunction = Student::new;

	public static void main(String[] args) {

		System.out.println(studentSupplier.get());
		
		System.out.println(stueFunction.apply("Priyam"));

	}

}
