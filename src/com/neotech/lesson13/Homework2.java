package com.neotech.lesson13;

public class Homework2 {

	
	public static void main(String[] args) {
		
		/*
		 
		Create a 2D array that first row will contain 4 names and second row will 
		contain grades, all Strings.
		Then you program should print name of the students that has A and B grade  
		  
		 */
		
		String[][] students = {
				{"Jennifer", "Justin", "Betul", "Mona"},
				{"A", 			"B", 	"C", 	"A"}
		};
		
		
		//lets look at it manually
		
		System.out.println(students[0][0] + " " + students[1][0]);
		System.out.println(students[0][1] + " " + students[1][1]);
		System.out.println(students[0][3] + " " + students[1][3]);
		
		
		
		
		//how to get the length in a 2D array String[][]
		
		System.out.println(students.length); //how many rows we have on the 2d array
		System.out.println(students[0].length);//how many columns we have on row 0
		
		
		
		//create a for loop to loop only for one index
		for (int i = 0; i < students[0].length; i++)
		{
			if(students[1][i].equals("A") || students[1][i].equals("B")) //grade is A or B
			{
				System.out.print(students[0][i] + " " + students[1][i] +"; ");
			}
		}
	
	//Break until: 8:15
		
		
		
	}
	
}