/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
		System.out.print("Enter a number: ");
		int number = sc.nextInt();
		
		System.out.println("Here are the next five numbers!!!");
		System.out.print(number + ", ");
		System.out.print(number + 1 + ", ");
		System.out.print(number + 2 + ", ");
		System.out.print(number + 3 + ", ");
		System.out.print(number + 4 + ", ");
		System.out.println(number + 5 + "!");
		System.out.println("Here are the next multiples of " + number + "!");
	    System.out.print(number + ", ");
		System.out.print(number + number + ", ");
		System.out.print(number + number + number + ", ");
		System.out.print(number + number  + number + number + ", ");
		System.out.print(number + number + number + number + number + ", ");
		System.out.println(number + number + number + number + number + number + "!"); 
		System.out.println("Here is " + number + " divided by 100!");
		double hundred = (number/100.0); 
		System.out.println(hundred);
		System.out.println("Here is " + number + " divided by 10!");
		double ten = (number/10.0);
		System.out.println(ten);
	}
}
