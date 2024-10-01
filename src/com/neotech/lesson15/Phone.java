package com.neotech.lesson15;

public class Phone {

	// features
	
	public String color, brand, model;
	public int price;

	// behaviors
	// call, camera, text
	
	
	
	public void calls ()
	{
		System.out.println(color + " " + brand + " " + model + " makes calls");
	}
	
	public void camera ()
	{
		System.out.println(color + " " + brand + " " + model + " makes photos");
	}
	
	public void text ()
	{
		System.out.println(color + " " + brand + " " + model + " can send and receive text messages");
	}
	
	public void navigate ()
	{
		System.out.println(color + " " + brand + " " + model + " can use GPS");
	}

}