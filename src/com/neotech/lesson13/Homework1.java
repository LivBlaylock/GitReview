package com.neotech.lesson13;

public class Homework1 {

	public static void main(String[] args) {


	


		/*
		 1. Create a 2D array where you will store the following values:
			- Mr, Mrs, Ms, Miss
			-Smith, Jordan, Jackson, Obama.
			
			After storing values print the following:
			Mrs Smith, Mr Obama, Ms Jackson, Miss Jordan.
			
			* Be careful because they are mixed. 
		
		 */
		
		String[][] names = { {"Mr", "Mrs", "Ms", "Miss"},
							 {"Smith", "Jordan", "Jackson", "Obama"} };
		
			//     0     	  1			 2			 3
		//row 0: {"Mr", 	"Mrs", 		"Ms", 		"Miss"}
		//row 1: {"Smith", "Jordan", 	"Jackson", "Obama"}
		
		System.out.println(names[0][1] + " " + names[1][0]);
		System.out.println(names[0][0] + " " + names[1][3]);
		System.out.println(names[0][2] + " " + names[1][2]);
		System.out.println(names[0][3] + " " + names[1][1]);
		
		
		

	}

}


