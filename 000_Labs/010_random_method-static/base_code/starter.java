/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {

        int a = (int)(Math.random() * 10); 

        
        int b = (int)(Math.random() * (100-1) + 1); 

       
        double c = Math.random() * (3.5-2.9)+2.5; 

       
        double d = Math.random() * (589-14)+14; 

        
        System.out.println("a (0-9): " + a);
        System.out.println("b (1-100): " + b);
        System.out.println("c (2.5-3.5): " + c);
        System.out.println("d (14-589): " + d);
		
     }
}
