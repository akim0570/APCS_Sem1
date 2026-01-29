/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Monopoly Bank!");
        System.out.println("Let's set up your bank account for the game!");

        System.out.println("We're going to create a bank account. What info do we know?");
        System.out.println("");
        System.out.println("1 - No info");
        System.out.println("2 - Name");
        System.out.println("3 - Name and initial deposit");

        int info = sc.nextInt();
        sc.nextLine(); 
        System.out.println("");

        BankAccount account; 

        if (info == 1) {
            account = new BankAccount();
        } else if (info == 2) {
            System.out.println("Enter the owner's name:");
            String owner = sc.nextLine();
            account = new BankAccount(owner);
        } else if (info == 3) {
            System.out.println("Enter the owner's name:");
            String owner = sc.nextLine();
            System.out.println("Enter initial deposit amount:");
            double deposit = sc.nextDouble();
            sc.nextLine(); 
            account = new BankAccount(owner, deposit);
        } else {
            System.out.println("Invalid option, I will create a default account.");
            account = new BankAccount();
        }

        System.out.println("--- Account Created ---");
        account.displayAccountInfo();

        System.out.println("Would you like to check your balance? (yes/no)");
        String response = sc.nextLine();
        System.out.println("");

        if (response.equals("yes")) {
            account.checkBalance();
        } else if (response.equals("no")) {
            System.out.println("Okay, balance not checked.");
        } else {
            System.out.println("Invalid input. Skipping balance check.");
        }

        System.out.println("Thank you for using the bank!");
    }
}