package com.learn.java8.methodreference;

import java.util.function.Predicate;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class RefactorMethodReferenceExample {

	static Predicate<Student> p1 = RefactorMethodReferenceExample::greaterThanGradelevel;

	static public boolean greaterThanGradelevel(Student s) {
		return s.getGradeLevel() >= 3;
	}

	public static void main(String[] args) {

		System.out.println(p1.test(StudentDataBase.studeSupplier.get()));
	}

}
