package com.neotech.lesson15;

public class PhoneStore {

	public static void main(String[] args) {

		// instantiation (create) an object from the class
		Phone iPhone = new Phone(); // instantiation (create) an object from the class
		iPhone.brand = "Iphone";
		iPhone.color = "Black";
		iPhone.model = "15 Pro max";
		iPhone.price = 1000;

		iPhone.calls();
		iPhone.text();
		iPhone.navigate();

		System.out.println("--------------");

		// instantiation (create) an object from the class
		Phone samsung = new Phone();
		samsung.brand = "Samsung";
		samsung.color = "White";
		samsung.model = "s24 ultra";
		samsung.price = 900;

		samsung.calls();
		samsung.text();
		samsung.navigate();

		System.out.println("--------------");

		// instantiation (create) an object from the class
		Phone nokia = new Phone();
		nokia.brand = "Nokia";
		nokia.color = "Gray";
		nokia.model = "8210";
		nokia.price = 200;

		nokia.calls();
		nokia.text();
		nokia.navigate();

	}

}