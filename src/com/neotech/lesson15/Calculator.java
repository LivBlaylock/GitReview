package com.neotech.lesson15;

public class Calculator {

	// this class will have 3 methods:add, multiply, and divide

	// add two numbers
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	// multiply two numbers
	void multiply(int a, int b) {
//		int result = a * b;
//		System.out.println(result);

		System.out.println(a * b);
	}

	// divide two numbers
	void divide(double a, double b) {
		double result = a / b;
		System.out.println("The division of " + a + " by " + b + " is " + result);
	}
}