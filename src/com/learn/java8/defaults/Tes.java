package com.learn.java8.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tes {

	public static void main(String[] args) {

		A a1 = new A("Priyam", 23);
		A a2 = new A("Iqbal", 21);
		A a3 = new A("Bhatti", 22);
		A a4 = new A("Saini", 28);
		A a5 = new A("Meshi", 22);

		List<A> list = Arrays.asList(a1, a2, a3, a4, a5);

		Comparator<A> comparator = Comparator.comparing(A::getAge);

		Comparator<A> comparator2 = Comparator.comparing(A::getName);

		list.sort(comparator.thenComparing(comparator2));

		//list.forEach(l -> System.out.println(l));

		System.out.println(list);
		
		
	}

}
