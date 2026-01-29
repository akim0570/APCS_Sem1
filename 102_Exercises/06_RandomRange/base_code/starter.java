/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        
        
		System.out.println("Enter two numbers to create a range for your random number!");
        
        System.out.print("Please enter an integar: ");
        int num1 = sc.nextInt();
        System.out.print("Please enter another integar (bigger than the first) : ");
        int num2 = sc.nextInt();
        System.out.println();
        
        if (num1>=num2){
            System.out.println("You entered in a number bigger than the other! Please enter another second number!");
            num2 = sc.nextInt();
            
        }
        
        System.out.println("Your range is " + num1 + " to "+ num2);
        System.out.println("Here are five numbers generated in that range.");
        int random1 = (int)(Math.random()*(num2-num1) + num1);
        int random2 = (int)(Math.random()*(num2-num1) + num1);
        int random3 = (int)(Math.random()*(num2-num1) + num1);
        int random4 = (int)(Math.random()*(num2-num1) + num1);
        int random5 = (int)(Math.random()*(num2-num1) + num1);
        
        System.out.print(random1 + ", ");
        System.out.print(random2 + ", ");
        System.out.print(random3 + ", ");
        System.out.print(random4 + ", ");
        System.out.print(random5);
	}
}
