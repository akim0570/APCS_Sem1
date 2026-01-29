/*
	Author:
	Date:
*/
import java.util.*;
import java.util.Scanner;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a word or pharse: ");
		String word = sc.nextLine();
		
		System.out.println("Your word/phrase as sPoNgE cAsE: ");
		
		while(word.indexOf(" ") != -1){
			String sent = word.substring(0, word.indexOf(" "));
			System.out.println(spongeWord(sent) + "");
			word = word.substring(word.indexOf(" ")+ 1);
		}
			System.out.println(spongeWord(word));
	}
			
		
		
		
		public static String spongeWord(String word){
			String ans ="";
		
			for (int i = 0; i<word.length(); i++){
				String letter = word.substring(i,i+1);
				if (i%2==0){
					letter = letter.toLowerCase();
				}
				else{
					letter = letter.toUpperCase();
				}
				ans = ans +letter;
		}
		return ans;
			
		}
	}

