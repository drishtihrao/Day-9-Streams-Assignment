/*
 * This class adds 15 random integers in an array list
 * The number are checked to be odd, even, divisible by 6 or less than 12 or to be grater than 50
 * All the integers are printed separately as per the conditions that they satisfy
 */
package com.cg.streams.integerlist;

import java.util.ArrayList;
import java.util.function.Predicate;

public class IntegerList {
	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<>();
		// Adding 15 random numbers to the list
		for (int i = 0; i < 15; i++)
			intList.add(1 + (int) (Math.random() * 1000));

		// Defining a Predicate to check if number is even
		Predicate<Integer> isEven = number -> number % 2 == 0;

		// Defining a Predicate to check if number is odd
		Predicate<Integer> isOdd = number -> number % 2 != 0;

		// Defining a Predicate to check if number is divisible by 6
		Predicate<Integer> isDivisibleBySix = number -> number % 6 == 0;

		// Defining a Predicate to check if number is less than 12
		Predicate<Integer> isLessThanTwelve = number -> number < 12;

		// Defining a Predicate to check if number is greater than 50
		Predicate<Integer> isGreaterThanFifty = number -> number > 50;

		System.out.println("Integers in the list are"); // Displaying all integers in the list
		intList.stream().forEach(System.out::println);

		System.out.println("Even numbers from the list are");
		intList.stream().filter(isEven).forEach(System.out::println); // Displaying all even numbers

		System.out.println("Odd numbers from the list are");
		intList.stream().filter(isOdd).forEach(System.out::println); // Displaying all odd numbers

		System.out.println("Numbers divisible by 6 are");
		intList.stream().filter(isDivisibleBySix).forEach(System.out::println); // Displaying all numbers divisible by 6

		System.out.println("Numbers less than 12 are");
		intList.stream().filter(isLessThanTwelve).forEach(System.out::println); // Displaying all numbers that are less
																				// than 12

		System.out.println("Numbers greater than 50 are");
		intList.stream().filter(isGreaterThanFifty).forEach(System.out::println); // Displaying all numbers that are
																					// greater than 50

	}
}
