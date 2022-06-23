package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReducedExample {

	public static int performMultiplication(List<Integer> integerList) {
		return integerList.stream().reduce(1, (a, b) -> a * b);
	}

	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream().reduce((a, b) -> a * b);
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
		System.out.println(result2.get());

	}

}
