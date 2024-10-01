package com.neotech.lesson11;

public class Task1 {

	public static void main(String[] args) {

		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B (use 2 different ways of creating an array)
		
		
		//1st way 
		char[] grades = new char[6]; //creating a new char array that can hold 6 elements
		grades[0] = 'A';
		grades[1] = 'B';
		grades[2] = 'C';
		grades[3] = 'D';
		grades[4] = 'E';
		grades[5] = 'F';
		
		System.out.println(grades[1]);
		
		
		
		//2nd way
		
		char[] grades2 = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		System.out.println(grades2[1]);
		//I cannot add another element
		//grades[6] = 'G';
		
		
		
		
	}

}