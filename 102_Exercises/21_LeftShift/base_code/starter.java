/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		String[] tvChars = {
			"Walter White", "Jesse Pinkman", "Saul Goodman", "Rick Grimes",
			"Eleven", "Michael Scott", "Dwight Schrute", "Jim Halpert",
			"Leslie Knope", "Ron Swanson", "Ted Lasso", "BoJack Horseman",
			"Homer Simpson", "Bart Simpson", "Peter Griffin", "Stewie Griffin",
			"Sheldon Cooper", "Geralt (Netflix)", "Wednesday Addams", "Joe Goldberg"
		};

		System.out.println("---------------------------------------------");
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars);
		printArray(tvChars);
		System.out.println("---------------------------------------------");

		/*
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		leftShift(tvChars, 5);
		printArray(tvChars);
		System.out.println("---------------------------------------------");
		*/
	}

	public static void printArray(String[] arr){
		for (int i = 0; i< arr.length; i++){
			System.out.println(arr[i]);
		}

	}

	public static void leftShift(String [] arr){
		String temp = arr[0];
		int num = 1;
		for (int i = 0; i< arr.length-1; i++){

			arr[i] = arr[i+1];
			
		}
		
		arr[arr.length - 1] = temp;
	}

	public static void leftShift(String [] arr, int num){
		for (int i = 0; i<num; i++){
			leftShift(arr);
		}
	}
}
