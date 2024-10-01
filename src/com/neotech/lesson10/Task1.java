package com.neotech.lesson10;

public class Task1 {

	public static void main(String[] args) {
//		Print the following pattern using a nested for loop.
//		1
//		22
//		333
//		4444
//		55555
		
		for (int i = 1; i <= 5; i++)
		{
			//each row, has a certain amount of columns
			
			//1st inner loop needs to run only once
			for (int j = 0; j < i; j++)
			{
				System.out.print(i);
			}
			
			
			System.out.println();
		}
		
		
		
		

	}

}
