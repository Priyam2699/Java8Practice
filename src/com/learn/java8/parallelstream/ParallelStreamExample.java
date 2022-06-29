package com.learn.java8.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static int sum_Sequential_Stream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}

	public static int sum_parallel_Stream() {

		return IntStream.rangeClosed(1, 100000).parallel().sum();

	}

	public static void main(String[] args) {

		System.out.println(sum_Sequential_Stream());
		System.out.println(sum_parallel_Stream());

	}

}
