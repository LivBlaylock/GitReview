package com.neotech.lesson12;

public class Task2 {

//	2. Create an array of integers and calculate the sum of all elements in the array
//	(use 2 different loops).

	public static void main(String[] args) {


			int[] numbers = { 5, 15, 20, 30, 50 };

			// using indexed for loop
			int sum = 0;
			for (int i = 0; i < numbers.length; i++) {
				sum += numbers[i];
			}
			System.out.println("The sum is: " + sum);

			// using enhanced for loop
			int sum2 = 0;
			for (int number : numbers) {
				sum2 += number;
			}

			System.out.println("The sum is: " + sum2);
		}

	}
