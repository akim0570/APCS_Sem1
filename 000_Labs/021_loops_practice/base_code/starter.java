/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		while (true){
		
		System.out.print("Please pick a number between 1 - 1000: ");
        int num1 = sc.nextInt();

        int a = (int)(Math.random() * 1000 + 1);

        if (a == num1) {
            System.out.println("You guessed the random number!");
        } else if (num1 > a) {
            System.out.println("Too high! Guess again!");
            
        } else {
            System.out.println("Too low! Guess again!");
        }


    }
}
}

