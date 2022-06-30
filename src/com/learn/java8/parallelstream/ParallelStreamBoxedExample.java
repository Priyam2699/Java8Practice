package com.learn.java8.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

	public static int sequentialSum(List<Integer> integerList) {

		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().reduce(0, (x, y) -> x + y);
		long endTime = System.currentTimeMillis();

		System.out.println("Duration for sequential: " + (endTime - startTime));

		return sum;

	}

	public static int parallelSum(List<Integer> integerList) {

		long startTime = System.currentTimeMillis();
		int sum = integerList.stream().parallel().reduce(0, (x, y) -> x + y);// needs to unboxing from integer to int
		long endTime = System.currentTimeMillis();

		System.out.println("Duration for Parallel: " + (endTime - startTime));

		return sum;

	}

	public static void main(String[] args) {

		List<Integer> collect = IntStream.rangeClosed(1, 10000).boxed().collect(Collectors.toList());

		System.out.println("For Sequential " + sequentialSum(collect));
		System.out.println("For Parallel " + parallelSum(collect));

	}

}
