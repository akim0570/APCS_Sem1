/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		System.out.println("How many rows would you like for your 2D array?");
		int rows = sc.nextInt();

		System.out.println("How many columns would you like for your 2D array?");
		int cols = sc.nextInt();

		int[][] arr = new int[rows][cols];

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				arr[r][c] = rand.nextInt(10) + 1;
			}
		}

		System.out.println("---------------------------------------");
		printArray(arr);
		System.out.println("---------------------------------------");

		System.out.println("What row would you like to get the average of?");
		int rowChoice = sc.nextInt();

		printRowAverage(arr, rowChoice);

		System.out.println("The average of the 2D array is " + getTotalAverage(arr));
	}

	public static void printArray(int[][] arr) {
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
		}
	}

	public static void printRowAverage(int[][] arr, int row) {
		int sum = 0;
		for (int c = 0; c < arr[0].length; c++) {
			sum += arr[row][c];
		}
		double avg = (double) sum / arr[0].length;
		System.out.println("The row average is " + avg);
	}

	public static double getTotalAverage(int[][] arr) {
		int sum = 0;
		int count = 0;

		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[0].length; c++) {
				sum += arr[r][c];
				count++;
			}
		}
		return (double) sum / count;
	}
}