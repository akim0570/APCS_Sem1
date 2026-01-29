/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {

		int[] arr = new int[20];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }

        System.out.println("----------------------------------------------------");
        System.out.println("These are the 20 numbers: ");

    	for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
}
        System.out.println("");
        System.out.println("----------------------------------------------------");

        int target = (int)(Math.random() * 10) + 1;
        System.out.println("The random number to look for is " + target);

        int duplicateCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Duplicate found at index " + i);
                duplicateCount++;
            }
        }

        System.out.println("Total number of duplicates for " + target + " is " + duplicateCount);
        System.out.println("----------------------------------------------------");

        System.out.println("Looking for two in a row:");

        boolean found = false;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println("Two in a row found at indexes " + i + " and " + (i + 1) +
                                   ". The number is " + arr[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No consecutive duplicates found.");
        }
    }
}