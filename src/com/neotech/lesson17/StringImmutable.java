package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {


		
		String str = "Hello"; //create a string hello --> create a String object pointing to it
		
		str.concat("World!"); //got the Hello + World! --> created a new string
		//did str change?? NO
		System.out.println(str);
		
		str.toUpperCase();//Did this change the str?
		//we created a new string "HELLO"
		
		//str was pointing at this string "Hello"
		//now I am just saying that str points to a new string str.concat("....").
		str = str.concat("World!");
		System.out.println(str);
		
		
		int a = 10;
		a = 5;
		//here I am NOT changing 10, but only where a points to
		
		
		//Am I creating a new string??
		String str2 = "Hello"; //I am creating a new string object str2, but it will point 
		//to the existing "Hello" that I created above.

	}

}