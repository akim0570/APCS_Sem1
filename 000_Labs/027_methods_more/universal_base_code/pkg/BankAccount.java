/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int account_number;
	private double balance;
	private boolean isActive;

	private static int nextAccountNumber = (int)(Math.random() * (1000-50+1)+50);

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		balance = 0;
		isActive = true;
		account_number = nextAccountNumber;
		nextAccountNumber++;
	}
	
	
		
	public BankAccount(String o){
		owner = o;
		balance = 0;
		isActive = true;
		account_number = nextAccountNumber;
		nextAccountNumber++;
	}

	public BankAccount(String o, double i){
		owner = o;
		balance = i;
		isActive = true;
		account_number = nextAccountNumber;
		nextAccountNumber++;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println("Current balance: $" + balance);
}
	public void displayAccountInfo(){
		System.out.println("Owner: " + owner);
		System.out.println("Balance: $" + balance);
		if (isActive = true){
			System.out.println("Status: Active");
		}
		else if (isActive = false){
			System.out.println("Status: Not Active");
		}
	
		System.out.println("Account Number: " + account_number);
}

}

