/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Please pick a number between 1 - 1000: ");
        int num1 = sc.nextInt();
        
        int a = (int)(Math.random() * 1000 + 1); 
        
        if (a==num1){
        	System.out.println("You guessed the random number!");
        	System.out.println("The number was "+ a);
        }
        else {
        	System.out.print("Your number wasn't the random number.");
        	System.out.print("");
        	System.out.print(" The number was "+ a);
        }
	}
}
