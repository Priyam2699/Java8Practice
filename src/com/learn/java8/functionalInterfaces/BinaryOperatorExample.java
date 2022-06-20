package com.learn.java8.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
	static BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;;

	public static void main(String[] args) {

		System.out.println(binaryOperator.apply(5, 10));

		BinaryOperator<Integer> maxby = BinaryOperator.maxBy(comparator);

		System.out.println("result of MaxBy is " + maxby.apply(4, 5));
	}

}
