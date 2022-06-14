package com.learn.java8.lambdas;

public class RunnableLambdaExample {

	public static void main(String[] args) {

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside Runnable 1");
			}
		};

		Thread t = new Thread(runnable);

		t.start();

		// now using java8

		Runnable r = () -> System.out.println("Inside Runnable 2");

		new Thread(r).start();

		new Thread(() -> System.out.println("Inside Runnabel 3")).start();

	}

}
