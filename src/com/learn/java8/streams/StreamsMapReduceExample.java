package com.learn.java8.streams;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamsMapReduceExample {

	private static int noOfNotebooks() {
		// stream() will create a stream of student
		// ma will create a stream of integers
		Integer reduce = StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel() >= 3)
				.filter(student -> student.getGender().equals("female")).map(Student::getNoteBooks).reduce(0,
						// .reduce(0,(a,b))->a+b)
						Integer::sum);

		return reduce;

	}

	public static void main(String[] args) {

		System.out.println("No of noteBooks: " + noOfNotebooks());
	}

}
