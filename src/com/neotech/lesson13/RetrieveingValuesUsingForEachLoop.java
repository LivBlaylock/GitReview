package com.neotech.lesson13;

public class RetrieveingValuesUsingForEachLoop {

	public static void main(String[] args) {


		String[][] animals = {
				{"cat", "dog", "bird"},
				{"tiger", "lion", "bear"},
				{"salmon","shrimp", "seabass"}
		};
		
		// initialization;     condition;     increment;
		for (int row = 0; row < animals.length; row++)//0, 1, 2
		{
			for (int col = 0; col < animals[row].length; col++)//0, 1, 2
			{
				System.out.print(animals[row][col] + " ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("------------------");
		
		//using for each
		for (String[] row : animals) //go through each 1D array in the animals 2D array
		{
			for (String col : row)
			{
				System.out.print(col + " ");
			}
		System.out.println();
		}
		
		
		//Break and task until: 9:30
		
		/*
		 * Create a 2D array of integer type with 3 rows and 4 columns and print all
		 * values of the whole array.
		 */
		
		
		
	}

}