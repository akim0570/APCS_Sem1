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
		System.out.println("Enter a word.");
		String answer = sc.nextLine();

		System.out.println("Letter by letter: ");
		
		for(int i = 0; i<answer.length();i++){
			System.out.print(i);
			System.out.print("  ");
			System.out.print(answer.substring(i,i+1));
			System.out.println("");
		}
	}
}
