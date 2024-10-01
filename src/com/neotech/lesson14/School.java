package com.neotech.lesson14;

public class School {
	
	public static void main(String[] args) {
	
		//ClassName identifier = NEW ClassName();
		
		Student s1 = new Student();
		
		s1.studentID = 1;
		s1.name = "Sinem";
		s1.lastName = "Tok";
		s1.school = "Neotech Academy";
		s1.age = 25;
		s1.grade = 'A';
		
		s1.study();
		s1.doHomework();
		s1.grade();
	

		
		Student s2 = new Student();
		s2.studentID = 2;
		s2.name = "Emrah";
		s2.lastName = "Nalbantouglu";
		s2.school = "Neotech Academy";
		s2.age = 25;
		s2.grade = 'A';
		
		s2.study();
		s2.doHomework();
		s2.grade();
		
		
		
		s1.study();
		
	}

}