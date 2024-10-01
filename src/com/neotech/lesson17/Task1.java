package com.neotech.lesson17;

public class Task1 {

	public static void main(String[] args) {

//		You have a String str = "Is it saturday? Is it raining? Do we have a Java Class today?"
//		How would you find out how many sentences are in that String?
		
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";

		//if I wanted to print "Sabah"
		System.out.println("\"Sabah\"");
		
	
		
		String[] array = str.split("[?]"); //we can escape the first meaning of ? by using \\?
		System.out.println("The number of sentences is: "  + array.length);

		//
		String str2 = "It is Thursday. Is it raining? We have a Java Class today!";
		String[] array2 = str2.split("[.?!]");
		// .?! --> split when you find all of those exactly like that
		// [.?!] --> split when you see any of those
		
		for (String s : array2)
		{
			System.out.println(s);
		}
		
		//how would we get the number of sentences
		System.out.println(array2.length);
		
	}

}