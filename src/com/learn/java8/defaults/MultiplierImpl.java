package com.learn.java8.defaults;

import java.util.List;

public class MultiplierImpl implements Mulitplier {

	@Override
	public int multiply(List<Integer> integers) {

		System.out.println("Inside multiplierImpl class");
		return integers.stream().reduce(1, (x, y) -> x * y);

	}

	static boolean isEmpty(List<Integer> integers) {

		System.out.println();
		return integers != null && integers.size() > 0;
	}
	
	
	public int size(List<Integer> integers) {

		System.out.println("Inside MultiplierImpl Class");
		return integers.size();
	}

}
