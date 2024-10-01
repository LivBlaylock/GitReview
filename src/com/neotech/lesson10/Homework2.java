package com.neotech.lesson10;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// Write a program that asks user to enter his/her username and password 
		//until user enters them correctly.
		
		//let us suppose that the real user and password are these: 
		String dbUser = "user";
		String dbPassword = "password";
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//input from the user trying to log in
		String user;
		String password;
		
		
		
		//1. ask the user for credentials  (scan)
		//2. check if they are true			(if)
			//3. if credentials are correct, then end the loop, done
			//3. if credentials are incorrect, then go to step 1
		
		
		
		//controlling the loop: 
			//1. using break to stop it
				//use while(true) - run always and then break the loop
			//2. controlling it with a boolean
				//make up a boolean variable, set it to true and make this false when the
				//situation happens, then the loop becomes false
		
	//	boolean flag = true;
		
		do {
			System.out.println("Enter your username and password: ");
			user = scan.next();
			password = scan.next();
			
			//check if credentials are true
			if (user.equals(dbUser)  && password.equals(dbPassword))
			{
				//if execution comes to this point, then we want to end the loop
				
				System.out.println("You are now logged in!!!");
			//	flag = false; //do not continue with the next loop
					break; //this will break out of the loop (even if the condition is still true)
			}
			
			
		}
		while(true); //this mean always stay true
	//	while(flag);
		
		

	}

}