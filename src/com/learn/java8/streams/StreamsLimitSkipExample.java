package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExample {

	public static Optional<Integer> limitTheNumbers(List<Integer> integers) {

		return integers.stream().limit(3).reduce((x, y) -> x + y);
	}

	public static Optional<Integer> skipTheNumbers(List<Integer> integers) {

		return integers.stream().skip(3).reduce((x, y) -> x + y);
	}

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(6, 7, 8, 9, 10);

		Optional<Integer> numbers = limitTheNumbers(list);

		if (numbers.isPresent())

		{
			System.out.println("the limit result is " + numbers.get());
		}

		Optional<Integer> numbers2 = skipTheNumbers(list);

		if (numbers2.isPresent())

		{
			System.out.println("the limit result is " + numbers2.get());
		}

	}

}
