/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Write a sentence!");
		String a = sc.nextLine();
			
		System.out.println("Write a sentence!");
		String b = sc.nextLine();
		
		System.out.println("");
		
		toString(a);
		toStringCombined(a, b);

	}
	public static void toString(String line_1){
		
		System.out.println("This is using the methods!");
		System.out.println(line_1);
		
		return;
	
	}
	public static void toStringCombined(String line_1, String line_2){
		System.out.println(line_1 + " " + line_2);
	}
}
