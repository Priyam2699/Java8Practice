package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.learn.java8.functionalInterfaces.Student;
import com.learn.java8.functionalInterfaces.StudentDataBase;

public class StreamReducedExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a * b);
	}

	public static Optional<Student> getHighestGpaStudent()
	{
		return StudentDataBase.getAllStudents().stream().reduce((s1,s2)->{
			if(s1.getGpa()>s2.getGpa())
				
			{
				return s1;
			}
			else
			{
				return s2;
			}
		});
	}
	
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 3, 5, 7);
		System.out.println(performMultiplication(list));
		Optional<Integer> result = performMultiplicationWithoutIdentity(list);

		System.out.println(result.isPresent());
		System.out.println(result.get());

		List<Integer> list2 = new ArrayList<Integer>();
		Optional<Integer> result2 = performMultiplicationWithoutIdentity(list2);

		System.out.println(result2.isPresent());
		//System.out.println(result2.get());
		
		//System.out.println(getHighestGpaStudent());
		
		Optional<Student> highestGpaStudent = getHighestGpaStudent();

		if(highestGpaStudent.isPresent())
		{
			System.out.println(getHighestGpaStudent().get());
		}
		
		
	}

}
