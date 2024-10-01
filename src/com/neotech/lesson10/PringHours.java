package com.neotech.lesson10;

public class PringHours {

	public static void main(String[] args) {
		// print the whole combination of hours in a digital clock

				// 00:00
				// 00:01
				// ..
				// ..
				// 01:00
				// ..
				// ..
				// 12:00
				// ..
				// ..
				// 23:59

				for (int hour = 0; hour < 24; hour++) {
					
				//	System.out.print(hour + " ");

					for (int min = 0; min < 60; min++) {
						
						
					//	System.out.println(hour + ":" + min);
						//I want to make sure that when i have a single digit, I add a 0 in front of it
						
						
						//what type of situations do I see in the current output:
						//1. when hour < 10 and min < 10 --> 1 : 1 ---> 01:01
						if(hour < 10 && min < 10)
						{
							System.out.println("0"+hour + ":0" + min);
						}
						//2. when hour < 10 and min >= 10
						else if (hour < 10 && min >= 10)
						{
							System.out.println("0"+hour + ":" + min);
						}
						//3. when hour >= 10  and min < 10
						else if (hour >= 10 && min < 10)
						{
							System.out.println(hour + ":0" + min);
						}
						//4. both, the hour and minutes are >= 10
						else
						{
							System.out.println(hour + ":" + min);
						}
						
					
					
					}

					
				}

			}

	
		
		
	}

