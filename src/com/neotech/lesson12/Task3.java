package com.neotech.lesson12;

public class Task3 {

//	Create an array of countries.
//	While retrieving all values from an array print capital for each country.
//			(use 2 different loops).

	public static void main(String[] args) {

		String[] countries = { "Morocco", "USA", "Turkiye", "Senegal", "Qatar" };

		// indexed for loop
		for (int i = 0; i < countries.length; i++) {
			if (countries[i].equals("Morocco")) {
				System.out.println(countries[i] + " - Rabat");
			} else if (countries[i].equals("USA")) {
				System.out.println(countries[i] + " - Washington DC");
			} else if (countries[i].equals("Turkiye")) {
				System.out.println(countries[i] + " - Ankara");
			} else if (countries[i].equals("Senegal")) {
				System.out.println(countries[i] + " - Dakar");
			} else if (countries[i].equals("Qatar")) {
				System.out.println(countries[i] + " - Doha");
			} else {
				System.out.println("We do not know!");
			}
		}

		System.out.println("---------------------");

		// enhanced for loop

		for (String country : countries) {
			if (country.equals("Morocco")) {
				System.out.println(country + " - Rabat");
			} else if (country.equals("USA")) {
				System.out.println(country + " - Washington DC");
			} else if (country.equals("Turkiye")) {
				System.out.println(country + " - Ankara");
			} else if (country.equals("Senegal")) {
				System.out.println(country + " - Dakar");
			} else if (country.equals("Qatar")) {
				System.out.println(country + " - Doha");
			} else {
				System.out.println("We do not know!");
			}
		}

	}

}