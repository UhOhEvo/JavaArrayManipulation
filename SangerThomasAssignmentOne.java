/*
 * Name: Thomas Sanger
 * Class: CS1450 M/W
 * Due: 1/25
 * Assignment #1
 * Description: This program consists of 1 and 2D array manipulation. It
 * 				also creates, writes to, and reads from a file.
 */

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class SangerThomasAssignmentOne {

	public static void main(String[] args) throws IOException {
		// constants for 2D array
		final int NUM_ROWS = 4;
		final int NUM_COLS = 5;
		
		// primitive variable declarations
		int sum = 0;
		double avg = 0;
		int median = 0;
		int mid = 0;
		int largest = 0;
		int numTimes = 0;
		
		// 1D and 2D array declarations
		int[] randomNumbers = new int[20];
		int[][] twoD = new int[NUM_ROWS][NUM_COLS];
		
		System.out.println("Random values stored in the array: ");
		
		// used to generate a random number array between 10 and 40
		for (int i = 0; i < randomNumbers.length; i++) {
			randomNumbers[i] = 11 + (int)(Math.random() * 30);
			System.out.println(randomNumbers[i]);
		} // end for
		
		System.out.println();
				
		// used to calculate the sum of the randomNumbers array
		for (int i = 0; i < randomNumbers.length; i++) {
			sum += randomNumbers[i];
		}
		
		// calculation for the sum using type casting to turn the int "sum" to a double
		avg = (double)sum / 20;
		
		// print statements for sum and average
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
		
		// sort method for the randomNumbers array
		Arrays.sort(randomNumbers);
		
		// 2 calculations to split the array in half then find the median
		mid = randomNumbers.length / 2;
		median = randomNumbers[mid];
		
		// calculation to find the largest number in randomNumbers
		largest = randomNumbers[randomNumbers.length - 1];
		
		// for loop to get the number of occurrences for the largest number
		for (int i = 0; i < randomNumbers.length; i++) {
			if (randomNumbers[i] == largest) {
				numTimes++; 
		  	}
		}
		
		// print statements for the median, the largest number, and the number of occurrences
		System.out.println("Median: " + median);
		System.out.println("Largest: " + largest + " which occured " + numTimes + " times");
		
		System.out.println();
		System.out.println("Values placed in 2D array:");
		
		// index to help display twoD in rows and columns
		int index = 0;
		
		// for loop to display rows and columns of twoD
		for (int row = 0; row < NUM_ROWS; row++ ) {
			for (int col = 0; col < NUM_COLS; col++) {
				twoD[row][col] = randomNumbers[index];
				index += 1;
				System.out.print(twoD[row][col] + " ");
			}
			
			// new row
			System.out.println();
		}
		
		System.out.println();
		
		// create file object
		File assignmentOne = new File("assignment1.txt");
		
		// create PrintWriter
		PrintWriter outputFile = new PrintWriter(assignmentOne);
		
		// for loop to output each number to assignmentOne
		for (int row = 0; row < NUM_ROWS; row++ ) {
			for (int col = 0; col < NUM_COLS; col++) {
				outputFile.println(twoD[row][col]);
			}
		}
		
		// closing the file
		outputFile.close();
		
		// scanner object to read file values
		Scanner readFile = new Scanner(assignmentOne);
		
		System.out.println("Random values stored in file in sorted order:");
		
		// for loop to display file values
		for (int i = 0; i < randomNumbers.length; i++) {
			System.out.println(readFile.nextLine());
		}
		
		// closing the file
		readFile.close();
		
		System.out.println();
		
		// Print statement to display file path
		System.out.println("File is in directory: " + assignmentOne.getAbsolutePath());
		
	} // main
 
} // assignment1