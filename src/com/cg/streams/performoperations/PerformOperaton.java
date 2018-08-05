/*
 * To check whether the given integer is odd, prime or palindrome
 */
package com.cg.streams.performoperations;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PerformOperaton {
	// Lambda expression - to return true if number is odd
	public Predicate<Integer> isOdd() {
		return number -> number % 2 != 0;
	}

	// Lambda expression - to return true if number is prime
	public Predicate<Integer> isPrime() {
		return number -> number > 1 && IntStream.range(2, number - 1).noneMatch(i -> number % i == 0);
	}

	// Lambda expression - to return true if number is palindrome
	public Predicate<Integer> isPalindrome() {
		return number -> Integer.toString(number)
				.equals(new StringBuilder(Integer.toString(number)).reverse().toString());
	}
}