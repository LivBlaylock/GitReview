package com.neotech.lesson14;

public class Student {

	//features: studentID, name, lastName, age, school, grade
	//behaviors: study(), doHomework()
	
	int studentID, age;
	String name, lastName, school;
	char grade;
	
	
	void study()
	{
		System.out.println(name + " " + lastName + " is studying!!!");
	}
	
	void doHomework()
	{
		System.out.println(name + " is doing the homework!!!");
	}
	
	void grade()
	{
		System.out.println(name + " has this grade: " + grade);
	}
	
	
}