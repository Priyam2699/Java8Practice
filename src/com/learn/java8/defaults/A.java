package com.learn.java8.defaults;

public class A {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}

	public void setAge(int age) {
		this.age = age;
	}

	public A(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
