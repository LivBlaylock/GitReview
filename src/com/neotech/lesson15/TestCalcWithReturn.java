package com.neotech.lesson15;

public class TestCalcWithReturn {

	public static void main(String[] args) {

		CalculatorWithReturn cal = new CalculatorWithReturn();

		// addition
		int result = cal.add(10, 5);
		System.out.println(result);
		// OR
		System.out.println(cal.add(10, 5));

		// multiplication
		System.out.println(cal.multiply(28, 55));

		// division
		double result1 = cal.divide(15.4, 2.7);
		System.out.println(result1);

		System.out.println("give me something " + cal.giveMeSomething());

		cal.dontGiveMyAnything();

		System.out.println("avg of 5, 7 and 3 is " + cal.average(5, 7, 3));

		// multiply 2 with the avg of 5,7 and 3
		System.out.println(cal.multiply(2, (int) cal.average(5, 7, 3)));

	}

}