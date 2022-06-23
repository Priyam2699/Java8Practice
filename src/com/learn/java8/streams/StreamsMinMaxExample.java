package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {

		return integerList.stream().reduce(0, (x, y) -> x > y ? x : y);

	}

	public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {

		return integerList.stream().reduce((x, y) -> x > y ? x : y);

	}

	public static void main(String[] args) {

		List<Integer> inteList = Arrays.asList(6, 7, 8, 9);

		// List<Integer> inteList = new ArrayList<Integer>();

		int max = findMaxValue(inteList);

		System.out.println("max value is :" + max);

		Optional<Integer> findMaxValueOptional = findMaxValueOptional(inteList);

		if (findMaxValueOptional.isPresent()) {
			System.out.println("MaxValue using Optional: " + findMaxValueOptional.get());
		}

		else {
			System.out.println("No MaxValue");
		}

	}

}
