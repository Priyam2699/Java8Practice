package com.learn.java8.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

	static Consumer<Student> c2 = (student) -> System.out.println(student);
	static Consumer<Student> c3 = (student) -> System.out.println(student.getName() + " " + student.getActivities());
	static Consumer<Student> c4 = (student) -> System.out.print(student.getName() + " " + student.getName());
	static Consumer<Student> c5 = (student) -> System.out.println(student.getName() + " " + student.getActivities());

	public static void printname() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c2);

	}

	public static void printNameStudentAndActivities() {

		List<Student> studentList = StudentDataBase.getAllStudents();

		studentList.forEach(c4.andThen(c5));

	}
	
	
	public static void printNameStudentAndActivitiesUSingCondition()
	{
		
		
		
		List<Student> studentList = StudentDataBase.getAllStudents()	;
		
		studentList.forEach(student ->{
			
			
			if(student.getGradeLevel()>=3)
			{
				c3.andThen(c4).accept(student);
			}
		} );
		
		
		
		
		
	}
	
	
	

	public static void main(String[] args) {

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());

		//c1.accept("Priyam");

		//printname();

		//printNameStudentAndActivities();
		
		
		printNameStudentAndActivitiesUSingCondition();

	}

}
