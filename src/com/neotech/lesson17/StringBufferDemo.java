package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		
		//How did we create a String 
		String a = "Hello"; //String literal
		String b = new String("Hello"); //using new keyword
		
		//mutable string class: 
		//StringBuffer
		//StringBuilder
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		
		//I cannot change a string object once its created
		a.concat(" All"); //this is not changing a
		System.out.println(a); 
		
		//I can change a StringBuffer object without creating a new one
		sb.append(" All!");
		System.out.println(sb);
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		
		String substr = sb.substring(2, 7);
		System.out.println(substr);
		
		
		
		//StringBuilder example
		StringBuffer strBuff = new StringBuffer("some string here");
		StringBuilder strBuild = new StringBuilder("Some string here");
		
		strBuild.append(" some more text ");
		
		System.out.println(strBuild);
		
	}

}