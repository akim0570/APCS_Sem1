/*
 *	Author:  
 *  Date: 
*/

import java.util.*;
import java.util.Scanner;
import java.util.Random;



class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };
        
		System.out.print("Enter a word to hide: ");
		String word = sc.nextLine().toLowerCase();
		
		int wordLen = word.length();

		int size = wordLen + 5;
		String[][] puzzle = new String[size][size];

		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
				puzzle[r][c] = "";
			}
		}

		
		int direction = (int)(Math.random() * 3);

		int row = 0;
		int col = 0;

		if (direction == 0) { 
			row = (int)(Math.random() * size);
			col = (int)(Math.random() * (size - wordLen));
		}
		else if (direction == 1) { 
			row = (int)(Math.random() * (size - wordLen));
			col = (int)(Math.random() * size);
		}
		else { 
			row = (int)(Math.random() * (size - wordLen));
			col = (int)(Math.random() * (size - wordLen));
		}

		
		for (int i = 0; i < wordLen; i++) {
		
		if (direction == 0) { 
		puzzle[row][col + i] = word.substring(i, i + 1);
		}
		else if (direction == 1) { 
		puzzle[row + i][col] = word.substring(i, i + 1);
		}
		else { 
		puzzle[row + i][col + i] = word.substring(i, i + 1);
		}
		}
		
		for (int r = 0; r < size; r++) {
			for (int c = 0; c < size; c++) {
		if (puzzle[r][c].equals("")) {
			int randomLetter = (int)(Math.random() * letters.length);
			puzzle[r][c] = letters[randomLetter];
		}
	
		}
		}
		System.out.println("\nCrossword Puzzle:");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(puzzle[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("\nFind the hidden word!");
	}
}