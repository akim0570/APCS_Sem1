/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100) + 1; 
        }

        int max = getArrayMax(arr);
        int min = getArrayMin(arr);
        double average = getArrayAverage(arr);

        System.out.println("Maximum of 100 random numbers: " + max);
        System.out.println("Minimum of 100 random numbers: " + min);
        System.out.println("Average of 100 random numbers: " + average);

        toStringArray(arr);
    }

    public static void toStringArray(int[] arr){
        System.out.println("The elements are:");
        System.out.println("---------------------------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
        System.out.println("---------------------------------");
    }

    public static int getArrayMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getArrayMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static double getArrayAverage(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
