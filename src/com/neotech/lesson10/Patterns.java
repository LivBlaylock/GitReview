package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
		/*
		  
		 
		 *
		 **
		 ***
		 ****
		 *****
		 
		 */ 
		
		//can I use a variable to control the size???
		int size = 5;
		
		
		//outer loop will take care of the rows
		
		for (int row = 0; row < size; row++)
		{
			//inner loop is responsible for the columns
			for (int col = 0; col <= row;col++)
			{
				//I took care of the rows, I need to take care of the columns as well
				//loop 1: I must make sure, that on the first row, this only run 1 iteration
				//loop 2: I must make sure, that on the second row, this only runs twice
				
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
		
		/*
		 
		 *****
		 ****
		 ***
		 **
		 *
		  
		 */	
		
		
		for (int row = size - 1; row > 0; row--)
		{
			for (int col = 0; col < row; col++)
			{
				//1st iteration:
					// row = 5, col = 0 ----> from 0 to 5  ---> 5 iterations
				//2nd iteration: 
					//row = 4, col = 0 -----> from 0 to 4 ----> 4 iterations
				
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}