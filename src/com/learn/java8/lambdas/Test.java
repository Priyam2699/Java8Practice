package com.learn.java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {

	
	
	public static void main(String[] args) {
		
		
		
		
		List<String> list = new LinkedList<String>();
		
		
		
		list.add("Priyam");
		list.add("Iqbal");
		list.add("Bhatti");
		list.add("Saini");
		list.add("munshi");
		list.sort((x,y)->x.compareTo(y));
		System.out.println(list);
		
		
		
		
		
		
		List<Integer> l1  = new LinkedList<Integer>();
		List<Integer> l2  = new LinkedList<Integer>();
		
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		l2.add(4);
		l2.add(3);
		l2.add(2);
		l2.add(1);
	
		
		String num1String = "";
		String num2String = "";
		
		for(Integer i: l1)
		{
		  
		   num1String +=i.toString();			
		}
		
		for(Integer j: l2)
		{
		  
		   num2String +=j.toString();			
		}
		
		
		
		System.out.println(num2String);
		System.out.println(num1String);
		
		
		Integer num1  = new Integer(num1String);
		
		Integer num2  = new Integer(num2String);
		
		Integer result = num1 + num2;
		
		
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
