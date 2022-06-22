package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Priyam");
		list.add("Gurjinder");
		list.add("Iqbal");
		
		for(String name: list)
		{
			System.out.println(name);
		}
		
		
		list.remove(0);
		//System.out.println(list);
		
		
		Stream<String> nameStream = list.stream();
		
		nameStream.forEach(System.out::println);
		// if we will try to traverse a stream more than once it will throw an exception
	 	nameStream.forEach(System.out::println);
		
	}
}
