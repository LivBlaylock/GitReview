package com.neotech.lesson11;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

		/*
		 * Ask the user to enter an integer and build the following pattern: 
		 * Hint: Use scanner, if user entered number 5, there should be 5 rows. 
		 * In the first row, 0 spaces, (2 * 5) - 1 stars
		 * In the second row, 1 spaces, (2 * 4) - 1 stars
		 * In the third row, 2 spaces, (2 * 3) - 1 stars 
		 * In the fourth row, 3 spaces, (2 * 2) - 1 stars
		 * In the fifth row, 4 spaces, (2 * 1) - 1 stars
		 * 
		 *********
		  *******
		   *****
		    ***
		     *
		 */

		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		
		
		for (int i = 0; i < num;i++)
		{
			//when i = 0, we print 0 spaces
			//when i = 1, we print 1 space...
			
			//this loop is to print spaces
			for (int j = 0; j < i; j++)
			{
				System.out.print(" ");
			}
			
			
			//this loop is to print stars
			//for num = 5, 
				//we need to print 9 stars on the 1st iteration
				//we need to print 7 stars on the 2nd iteration
			
			//0 up to 9 (calculate this using num=5 and i=0) 2*(num-i) - 1
			//0 up to 7 (num=5, i=1)						2*(5-1)-1 ---> 7
			
			
			for(int k = 0; k < 2*(num-i)-1; k++)
			{
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
		
		
		
		

	}

}