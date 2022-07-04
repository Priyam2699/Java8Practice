package com.learn.java8.defaults;

import java.util.List;

public interface Mulitplier {

	int multiply(List<Integer> integers);

	default int size(List<Integer> integers) {

		System.out.println("Inside Multiplier interface");
		return integers.size();
	}

	static boolean isEmpty(List<Integer> integers) {

		return integers != null && integers.size() > 0;
	}

}
