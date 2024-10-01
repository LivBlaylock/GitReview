package com.neotech.lesson14;

public class Dog {

	//Create a class Dog
	//features: breed, size, color, age
	//behaviors: eat(), run(), breed()

	//Create a class Shelter
	//create 3 objects of class Dog and initialize the values for each
	
	String breed, size, color;
	int age;
	
	
	
	void eat()
	{
		System.out.println(breed + " is eating!!");
	}
	
	void run()
	{
		System.out.println(breed + " runs very fast!");
	}
	
	void breed()
	{
		System.out.println(breed + " breeds!");
	}
	
}