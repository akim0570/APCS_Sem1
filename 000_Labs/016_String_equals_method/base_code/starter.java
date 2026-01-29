/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Next, would you like to be a Dark Arts Specialist, Auror, or Potion Master?");
	    String role = sc.nextLine();
	    
	    if (role.equals("Dark Arts Specialist")){
	        System.out.println("Your role is " + role + " ! Fight against");
	}
	}
}