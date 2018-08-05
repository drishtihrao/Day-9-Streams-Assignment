/*
 * A program to create a test file and write 100 random integers in it, ranging from 1 to 49
 * The file is read and the content of the file is stored in an array list
 * The list is then written on the console
 */
package com.cg.streams.randominteger;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Result {
	public static void main(String[] args) throws IOException {
		//Creating a file boy.txt
		File file = new File("boy.txt"); 

		PrintWriter printWriter = new PrintWriter(file);

		//Writing 100 random integers to the file, each on a new line
		for (int i = 0; i < 100; i++) {
			Random random = new Random();
			printWriter.println(1 + random.nextInt(49)); 
		}
		printWriter.close();

		//Creating an ArrayList to store integers read from file
		ArrayList<Integer> intList = new ArrayList<>(); 
		Scanner scanner = new Scanner(file);
		
		//Reading the integers from file and adding them to ArrayList
		while (scanner.hasNextInt()) {
			intList.add(scanner.nextInt()); 
		}
		scanner.close();

		//Removing duplicate values and display sorted ArrayList
		intList.stream().distinct().sorted().forEach(System.out::println);
	}
}
