package com.learn.java8.defaults;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodEmpty {

	public static void main(String[] args) {

		List<String> stringList = Arrays.asList("adam", "jenny", "alex", "dan", "mike", "eric");

		// before java

		// Collections.sort(stringList);

		// System.out.println("Sorted list using collections method: " + stringList);

		// after java

		stringList.sort(Comparator.reverseOrder());

		System.out.println("sorted list using List.sort(): " + stringList);

	}

}
