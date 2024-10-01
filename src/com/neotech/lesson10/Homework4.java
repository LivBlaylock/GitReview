package com.neotech.lesson10;

import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		// Create a program that will be asking user to apply for a credit card 10 times.
		// As soon you get an "yes" from a user program should stop asking.

		
		// Create a program that will be asking user to apply for a credit card 10 times.
				// As soon you get an "yes" from a user program should stop asking.

				
				Scanner scan = new Scanner(System.in);
				
				String answer;
				
				
				for (int i = 0; i < 10; i++)
				{
					System.out.println("Do you want to apply for a credit card?");
					answer = scan.next();
					
					
				if(answer.equalsIgnoreCase("yes"))
				{
					System.out.println("Perfect, let's get you started!");
					break;
				}
				}
				
			}
			
		
		
		
		
	}

