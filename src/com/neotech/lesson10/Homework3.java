package com.neotech.lesson10;

public class Homework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Print numbers from 1 to 50 except those that are divisible by 3.

		// for any loop we need to define:
		// starting point
		// ending point
		// increment (variable change)

		// using while loop

		int num = 1;

		while (num <= 50) {
			
			if (num % 3 == 0) {
				
				num++;
				continue;
			}
			else
			{
				System.out.print(num + " ");
			}
			num++;
		}
		
		System.out.println();
		
		
		//do while 
		int i = 1;
		
		do {
			if(i % 3 == 0)
			{
				i++;//isolated increment, only executes if the condition is true
				continue;
			}
			
			System.out.print(i + " ");
			
			i++;
		}
		while(i <= 50);
		
		System.out.println();
		
		
		//for loop 
		
		for(int j = 1;j <= 50; j++)
		{
			if(j % 3 == 0)
			{
				continue;
			}
			
			System.out.print(j + " ");
		}

	}

}
