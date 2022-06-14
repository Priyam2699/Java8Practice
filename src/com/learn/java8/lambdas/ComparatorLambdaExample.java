package com.learn.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	
	
	
	
	public static void main(String[] args) {
		
		
		// Prior Java8
		
		
		Comparator< Integer> comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				
				return o1.compareTo(o2);
			}
		};
		
		
	System.out.println("Result of the comparator is :"+comparator.compare(3, 2));
		
	
	// using java 8
	
	
		Comparator<Integer> comparator1 = (a,b) -> a.compareTo(b);
		
		
		System.out.println("Result of comparator using lambdas is "+comparator1.compare(3, 2));
	
	
	}
	
	
	
}
