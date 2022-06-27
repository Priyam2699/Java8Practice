package com.learn.java8.streams;

import java.util.stream.Stream;

public class StreamsGenerateIterateExample {

	public static void main(String[] args) {

		Stream<String> of = Stream.of("priyam", "bhatti", "bhullar");

		of.forEach(System.out::println);

		Stream.iterate(1, x -> x * 2).limit(10).forEach(System.out::println);

	}

}
