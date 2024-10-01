package com.neotech.lesson12;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) {

		int[][] numbers = new int[2][4];

		// 1 2 3 4
		// 5 6 7 8

		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));

		// lets initialize the values of the first row
		numbers[0][0] = 10;
		numbers[0][1] = 15;
		numbers[0][2] = 20;
		numbers[0][3] = 25;

		// initialize the values of the second row
		numbers[1][0] = 30;
		numbers[1][1] = 35;
		numbers[1][2] = 40;
		numbers[1][3] = 45;

		System.out.println(Arrays.toString(numbers[0]));
		System.out.println(Arrays.toString(numbers[1]));

		// how do i print 40?
		System.out.println(numbers[1][2]);

		// what about 25?
		System.out.println(numbers[0][3]);

		System.out.println("----------------");

		int[][] nums = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		System.out.println("How can i print 12?");
		System.out.println(nums[2][3]);

		// System.out.println(nums[3][3]); this will give out of bounds exception

		// lets change the value of 7 to 13
		nums[1][2] = 13;

		System.out.println(Arrays.toString(nums[1]));

	}

}