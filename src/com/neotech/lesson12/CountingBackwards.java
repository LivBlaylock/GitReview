package com.neotech.lesson12;

public class CountingBackwards {

	public static void main(String[] args) {
		// 4321
		// 4321
		// 4321
		// 4321

		for (int row = 1; row <= 4; row++) {

			// for each row, the column goes from 4 down to 1 and we print the column

			for (int column = 4; column >= 1; column--) {
				System.out.print(column);
			}
			System.out.println();
		}
		System.out.println("_____________________________");

		// 4444
		// 3333
		// 2222
		// 1111

		for (int row = 4; row >= 1; row--) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(row);
			}

			System.out.println();
		}

		System.out.println("_____________________________");
		// Same pattern different solution

		for (int row = 1; row <= 4; row++) {

			for (int col = 1; col <= 4; col++) {
				System.out.print(5 - row);
			}

			System.out.println();

		}
	}
}
