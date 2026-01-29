/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        int size = (int)(Math.random() * (200 - 51 + 1)) + 51;
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            sum = sum + arr[i];
        }

        double average = sum / arr.length;

        System.out.println("The elements are:");
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.println("---------------------------------");

        System.out.println("There are " + arr.length + " number of elements.");
        System.out.println("The maximum of " + arr.length + " random numbers is: " + max);
        System.out.println("The minimum of " + arr.length + " random numbers is: " + min);
        System.out.println("The average of " + arr.length + " random numbers is: " + average);
    }
}