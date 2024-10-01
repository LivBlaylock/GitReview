package com.neotech.lesson11;

public class ArrayLength {

	public static void main(String[] args) {

		
		//create an array of names
		String[] names = new String[5]; //I have defined the size, the values are null by defaul
		names[0] = "Oluwabunmi";
		names[1] = "Nazli";
		names[2] = "Ameen";
		names[3] = "Maya";
		names[4] = "Khen";
		
		int arrayLength = names.length;
		System.out.println(arrayLength);
		
		
		int[] scores = {90, 95, 92, 85, 76, 85, 87, 65};
		System.out.println(scores.length);
		

	}

}