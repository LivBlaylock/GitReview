package com.neotech.lesson11;

public class RecapJava {

	public static void main(String[] args) {

		/*
		 
	    *
	   * *
	  * * *
	 * * * *
	* * * * *
			 
			 */
		
		
		for (int i = 1; i <= 5; i++)
		{//1st row: 4 spaces + 1 star
		//2nd row: 3 spaces + 2 stars
		//3rd row: 2 spaces + 3
			
			
			//loop for spaces
		
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
		
			
			//loop for stars
			
			for (int k = 1; k <= i; k++)
			{
				System.out.print("* ");
			}
			
			
			
			
			//same as hitting enter
			System.out.println();
		}
		
		
		
		
		
		
		

	}

}