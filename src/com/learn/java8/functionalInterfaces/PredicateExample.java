package com.learn.java8.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> predicate = i -> i % 2 == 0;
	static Predicate<Integer> predicate2 = i -> i % 5 == 0;

	public static void predicateAnd() {
		System.out.println(predicate.and(predicate2).test(30));
		System.out.println(predicate.and(predicate2).test(9));

	}
	
	
	
	
	
	public static void predicateOr()
	{
		
		System.out.println(predicate.or(predicate2).test(13));
		System.out.println(predicate.or(predicate2).test(15));

		
	}
	
	public static void predicateNegate()
	{
		
		
		System.out.println(predicate.negate().test(10));
		
	}

	public static void main(String[] args) {

		Predicate<Integer> predicate = i -> i % 2 == 0;

		System.out.println(predicate.test(15));

		predicateAnd();
		predicateOr();
		
		predicateNegate();

	}

}
