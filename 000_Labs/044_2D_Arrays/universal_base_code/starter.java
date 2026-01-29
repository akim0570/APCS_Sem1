/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		  // 1. Create a 2D array of size 5x4
        int[][] numbers = new int[5][4];

        // 2. Manually assign values
        numbers[0][0] = 1; numbers[0][1] = 2; numbers[0][2] = 3; numbers[0][3] = 4;
        numbers[1][0] = 2; numbers[1][1] = 2; numbers[1][2] = 3; numbers[1][3] = 4;
        numbers[2][0] = 3; numbers[2][1] = 3; numbers[2][2] = 3; numbers[2][3] = 4;
        numbers[3][0] = 4; numbers[3][1] = 4; numbers[3][2] = 4; numbers[3][3] = 4;
        numbers[4][0] = 5; numbers[4][1] = 5; numbers[4][2] = 5; numbers[4][3] = 5;

        // 3. Print size of array
        System.out.println("The integer 2D array has " + numbers.length + " rows and " + numbers[0].length + " columns.");
        System.out.println("The 2D array is the following:");

        // 4. Print the array
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}