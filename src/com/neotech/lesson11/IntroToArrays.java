package com.neotech.lesson11;

public class IntroToArrays {

	public static void main(String[] args) {

		
		//declare and assign an int
		
		int num = 10;
		int num2 = 20;
		int num3 = 30;
		
		//what if I have a way to group all of these same-type variables together
		
		//1st way
		int[] array1 = new int[5]; //we declare an array and we gave it a length of 5
		//this is the current state of array1 = [0][0][0][0][0]
		//the size is fixed, once I said in line 17 that the size is 5, it will not change
		
		//the number we use to access elements in an array is called an index
		System.out.println(array1[1]); //0 by default
		
		
		//how do we assign values
		//if I were to reassing a value to num3
		num3 = 5;
		//I have to assign the value on the specific index
				//index   0  1  2  3  4
		array1[0] = 5; //[5][0][0][0][0]
		array1[1] = 10;//[5][10][0][0][0]
		array1[2] = 15;//[5][10][15][0][0]
		array1[4] = 25;//[5][10][15][0][25]
		array1[3] = 20;//[5][10][15][20][25]
		
		
		
		//2nd way
		int[] array2;
		
		array2 = new int[3]; // Paul: this means 3 elements  with index 0, 1 and 2.
		
		array2[2] = 10; //assigning a value to index 2 (third element)
		
		//array2[3] = 15; //Exception: ArrayIndexOutOfBounds
		
		
	//	int[] array1 = new int[5];  --> same way, only the type changes
		String[] strArray = new String[2];
		
		//assigning a value
		strArray[1] = "New York";
		strArray[0] = "London";
	//	strArray[2] = "Ankara"; // you are trying to assign a value to a location that does not exist
		strArray[1] = "New Jersey";
		
		System.out.println(strArray[1]);
		
		
		char[] letters = new char[6];
		letters[0] = 'A';
		letters[1] = 'B';
		letters[2] = 'C';
		letters[3] = 'D';
		letters[4] = 'E';
		letters[5] = 'F';
		
		System.out.println("The letter at index 5 is: " + letters[5]);
		
		//Break and Task: 9:15
		// Create an array of chars and store grades into it: A,B,C,D,E,F. 
		// Then print a grade B
		
		
	}

}