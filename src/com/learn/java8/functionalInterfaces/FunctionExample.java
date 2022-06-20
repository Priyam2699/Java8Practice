package com.learn.java8.functionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

	
	static Function<String, String> function = (name) -> name.toUpperCase();	
	
	
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat(" dua");	

	public static void main(String[] args) {
		
		
		System.out.println("Result is :" +function.apply("Priyam"));
		System.out.println("Result of anthen is "+function.andThen(addSomeString).apply("Priyam"));
		System.out.println("Result of anthen is "+function.compose(addSomeString).apply("Priyam"));

		
	}
}
