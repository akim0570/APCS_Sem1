/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please input your first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Please input your second number: ");
        int num2 = sc.nextInt();
        
        System.out.print("Please input your third number: ");
        int num3 = sc.nextInt();
        
        
        if (num1 > num2 && num1 > num3) {
            System.out.println("Your first number is the largest!");
            System.out.println("The number was " + num1);
        } 
        else if (num2 > num1 && num2 > num3) {
            System.out.println("Your second number is the largest!");
            System.out.println("The number was " + num2);
        } 
        else {
            System.out.println("Your third number is the largest!");
            System.out.println("The number was " + num3);
        }
        
        
        if (num1 < num2 && num1 < num3) {
            System.out.println("Your first number is the smallest!");
            System.out.println("The number was " + num1);
        } 
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Your second number is the smallest!");
            System.out.println("The number was " + num2);
        } 
        else {
            System.out.println("Your third number is the smallest!");
            System.out.println("The number was " + num3);
        }
    }
}
