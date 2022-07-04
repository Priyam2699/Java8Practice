package com.learn.java8.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {

		Mulitplier mulitplier = new MultiplierImpl();
		List<Integer> integers = Arrays.asList(1, 3, 5);

		System.out.println("Result is : " + mulitplier.multiply(integers));
		System.out.println("Default is size: " + mulitplier.size(integers));
		System.out.println("static method body is : " + Mulitplier.isEmpty(integers));
	}

}
