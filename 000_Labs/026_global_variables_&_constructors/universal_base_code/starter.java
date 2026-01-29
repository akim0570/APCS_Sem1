/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
	
        BankAccount account1 = new BankAccount();
        
        BankAccount account2 = new BankAccount("Zoey",1000);
        
        BankAccount account3 = new BankAccount("Mira", 200);
        
        BankAccount account4 = new BankAccount("Rumi");
        
        // Print details for all accounts
        account1.printDetails();
        account2.printDetails();
        account3.printDetails();
        account4.printDetails();
    }
}
