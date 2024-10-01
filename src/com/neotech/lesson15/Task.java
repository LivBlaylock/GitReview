package com.neotech.lesson15;

public class Task {
	/*
	 * method1: Create a method that will take 2 parameters as numbers and prints
	 * which number is larger.
	 * 
	 * method2: Create a method that will take a number and prints whether the
	 * number is even or odd.
	 * 
	 * method3: Create a method that will say Hello in a different language based on
	 * the country that will passed when method is executed.
	 */

	void larger(int a, int b) {
		if (a > b) {
			System.out.println(a + " is larger than " + b);
		} else if (b > a) {
			System.out.println(b + " is larger than " + a);
		} else {
			System.out.println("The numbers are equal");
		}
	}

	void evenOrOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
	}

	void sayHello(String country) {
		switch (country) {
		case "US":
		case "UK":
			System.out.println("Hello!");
			break;
		case "Mexico":
			System.out.println("Hola!");
			break;
		case "Turkiye":
			System.out.println("Merhaba");
			break;
		default:
			System.out.println("I dont know how to say hello for " + country);
			break;
		}
	}

	public static void main(String[] args) {

		Task task = new Task();

		task.larger(33, 57);
		task.larger(7, 7);

		task.evenOrOdd(29);
		task.evenOrOdd(98);

		task.sayHello("US");
		task.sayHello("Mexico");
		task.sayHello("Turkiye");
		task.sayHello("France");
	}

}