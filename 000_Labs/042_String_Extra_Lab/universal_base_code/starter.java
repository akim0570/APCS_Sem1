/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence without any punctuation at the end:");
        String a = sc.nextLine();
        String sum = "";

        while(a.indexOf(" ") != -1) { 
            String word = a.substring(0, a.indexOf(" ")); 
            a = a.substring(a.indexOf(" ") + 1); 
            sum = word + " " + sum;
            
            
	}
	    
        System.out.println("Reversed sentence: " +  a + " " + sum) ;
    }
}
