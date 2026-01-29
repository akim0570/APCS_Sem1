/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;
public class BankAccount {    
   // ------- GLOBAL VARIABLES -------
    private String owner;
    private int account_number;
    private double balance;
    private boolean isActive;

    private static int nextAccountNumber = (int)(Math.random() * (1000 - 50 + 1) + 50);

    // ------- CONSTRUCTORS -------
    public BankAccount() {
        owner = "unknown";
        balance = 0;
        isActive = true;
        account_number = nextAccountNumber++;
    }

    public BankAccount(String o) {
        owner = o;
        balance = 0;
        isActive = true;
        account_number = nextAccountNumber++;
    }

    public BankAccount(String o, double i) {
        owner = o;
        balance = i;
        isActive = true;
        account_number = nextAccountNumber++;
    }

    // ------- ACCESSORS -------
    public String getOwner() { return owner; }
    public double getBalance() { return balance; }
    public boolean isActive() { return isActive; }

    // ------- MUTATORS -------
    public void setOwner(String o) { owner = o; }

    public void closeAccount() {
        isActive = false;
        balance = 0;
        System.out.println("Account closed for " + owner);
    }

    public void deposit(double amount) {
        if (!isActive) {
            System.out.println("Account is closed. Cannot deposit.");
        } else if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Cannot deposit negative amount!");
        }
    }

    public void withdraw(double amount) {
        if (!isActive) {
            System.out.println("Account is inactive. Cannot withdraw.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else if (amount <= 0) {
            System.out.println("Cannot withdraw negative or zero amount!");
        } else {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        }
    }

    // ------- HELPER METHODS -------
    public void checkBalance() {
        System.out.println("Current Account Balance: $" + balance);
    }

   public void displayAccountInfo() {
    System.out.println("\n--- Account Info ---");
    System.out.println("Owner: " + owner);
    System.out.println("Account Number: " + account_number);
    System.out.println("Balance: $" + balance);

    if (isActive) {
        System.out.println("Status: Active");
    } else {
        System.out.println("Status: Not Active");
    }
}
}