/*
 *	Author:  
 *  Date: 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your base number?");
		int num1 = sc.nextInt();
			
		System.out.println("What is your exponent number?");
		int num2 = sc.nextInt();
		
		int result = pow(num1, num2);
		
    	System.out.println("Your answer is: " + result);
	}
		
	public static int pow(int base, int power) {
	    int counter = 0;
	    int total = 1;

		while (counter < power) {
	 		total = total * base;
	 		counter++;
	 	}
	 	
	 	return total;
	}   
}
