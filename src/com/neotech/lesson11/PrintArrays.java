package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {

		int[] points = {95, 65, 84, 76, 99, 89};
		
		//printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);

		int size = points.length;
		
		for (int i = 0; i < size; i++) 
		//ArrayIndexOutOfBoundsException - when you try to access an index that you do not have in the array
		{
			System.out.print(points[i] + " ");
		}
		
	
		
		
	}

}