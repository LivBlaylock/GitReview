package com.neotech.lesson10;

public class Task2 {

	public static void main(String[] args) {
//		Get input from the user, then based on that print this structure
//		For ex: input = 5

//		1
//		22
//		333
//		4444
//		55555
//		4444
//		333
//		22
//		1
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the size of the pattern:");
		int size = scan.nextInt();
		
		for(int row = 1; row <= size; row++)
		{
			//first loop: row = 1, col: 0 to 1 (print row)
			//second: row = 2, col: 0 to 2 (print row)
			for (int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}

		
		
		
		for(int row = size-1; row >= 1; row--)
		{
			//first loop: row = 1, col: 0 to 1 (print row)
			//second: row = 2, col: 0 to 2 (print row)
			for (int col = 0; col < row; col++)
			{
				System.out.print(row);
			}
			System.out.println();
		}
		
		
	}

}
