package com.learn.java8.functionalInterfaces;

public class FunctionExample1 {

	public static String performConcatString(String str)
	{
		
		return FunctionExample.addSomeString.apply(str);
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(performConcatString("Hello"));
		
	}
	
	
}
