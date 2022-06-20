package com.learn.java8.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

	public static void main(String[] args) {

		Supplier<Student> studentSupplier = () -> {

			return new Student("Priyam", 8, 4.6, "male",
					Arrays.asList("swimming", "basketball", "volleyball", "gaming"));
		};

		Supplier<List<Student>> supplierList = () -> StudentDataBase.getAllStudents();

		System.out.println("Student is " + studentSupplier.get());

		System.out.println("Students are : " + supplierList.get());

	}

}
