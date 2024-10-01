package com.neotech.lesson12;

public class Recap {

	public static void main(String[] args) {
	
		int[] grades = new int[5]; // [0, 0, 0, 0, 0]

		System.out.println("The size of this array is:" + grades.length);

		System.out.println("Grade with index 2 is: " + grades[2]);

		System.out.println("Second grade in my array is: " + grades[1]);

		// 0 1 2 3 4
		// [0, 0, 0, 0, 0]

		grades[3] = 90;

		// 0 1 2 3 4
		// [0, 0, 0, 90, 0]

		// grades[5] = 100; this will give us a run time error: out of bounds exception

		// grades[0] = "Paul"; this will give us a compile time error

		grades[2] = 100;
		grades[4] = 95;
		// 0 1 2 3 4
		// [0, 0, 100, 90, 95]

		grades[1] = 85;
		grades[0] = 80;
		// 0 1 2 3 4 indexes
		// [80, 85, 100, 90, 95] values

		// Can i find the avg of the grades?

		// 1st way
		int total = grades[0] + grades[1] + grades[2] + grades[3] + grades[4];
		System.out.println("Sum of all grades is: " + total);

		int avg = total / 5;
		System.out.println("Avg of all grades is: " + avg);

		System.out.println("-------------------------");

		// 2nd way
		int sum = 0;
		for (int i = 0; i < grades.length; i++) {
			sum += grades[i];
		}
		System.out.println("Sum of all grades is: " + sum);
		System.out.println("Avg of all grades is: " + sum / grades.length);

		System.out.println("-------------------------");

		String[] cities = { "Boston", "Istanbul", "Madrid", "Beirut", "Chicago", "Paris" };
		System.out.println("The lenght of the array is:" + cities.length);

		// how can i print the last city
		int lastIndex = cities.length - 1;
		System.out.println("The last city is:" + cities[lastIndex]);

		// how do i print the city names on the screen
		for (int i = 0; i < cities.length; i++) {
			System.out.print(cities[i] + ",");
		}

		System.out.println();

		// how do i print the city names in reverse order
		for (int i = lastIndex; i >= 0; i--) {
			System.out.print(cities[i] + ",");
		}

	}

}
