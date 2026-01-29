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
		
		System.out.println("Symbols: ");
		String s = sc.nextLine();

		System.out.println("Number of rows: ");
		int r = sc.nextInt(); 

		System.out.println("Number of columns: ");
		int c = sc.nextInt(); 
		
		for(int q = 0; q < r; q++){
			for (int j = 0; j < c; j++){
				System.out.print(s + " ");
			}
			System.out.println();
		}

		
	}
}
