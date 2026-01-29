/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a message to encode or decode:");
		String message = sc.nextLine();
	

		String encoded = Cipher.encode(message);
		System.out.println("Encoded/Decoded message: " + encoded);
		
		System.out.println("Enter a key number for keyed encoding:");
		int key = sc.nextInt();
		
		String keyed = Cipher.keyedEncode(message, key);
		System.out.println("Keyed Encoded/Decoded message: " + keyed);
	}
}

