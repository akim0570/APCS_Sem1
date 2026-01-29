/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	  Scanner sc = new Scanner (System.in);
	  System.out.print("Please give your name: ");
	  String name = sc.nextLine();
	  System.out.print("Please enter an integer: ");
	  int number = sc.nextInt();
	  int counter = 0;
	  while (true){
	  if (counter>number-1){
	   break;
}
	 System.out.println(counter + ". " + name);
     counter=counter + 1;
}
}
}
