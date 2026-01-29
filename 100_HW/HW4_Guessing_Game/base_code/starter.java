/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;
import java.util.Random;

class starter {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        int game = (int)(Math.random() * 3);

        if (game == 0) {
            // Game 1: Kpop Album
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println("Game 1: Guess the Kpop album!");
            System.out.println("Hint 1: This is from a girl group!");
            System.out.print("Your guess: ");
            String guess1 = sc.nextLine();

            if (guess1.equals("This is for") || guess1.equals("this is for")) {
                System.out.println("You got it!");
            } else {
                System.out.println("Wrong! Hint 2: This is from the group TWICE!");
                System.out.print("Your guess: ");
                String guess2 = sc.nextLine();
                if (guess2.equals("This is for") || guess2.equals("this is for")) {
                    System.out.println("You got it!");
                } else {
                    System.out.println("Sorry, the answer was This is For.");
                }
            }

        } else if (game == 1) {
            // Game 2: Movie
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println("Game 2: Guess the movie!");
            System.out.println("Hint 1: It's a musical movie.");
            System.out.print("Your guess: ");
            String guess1 = sc.nextLine();

            if (guess1.equals("La la land") || guess1.equals("la la land")) {
                System.out.println("You got it!");
            } else {
                System.out.println("Wrong! Hint 2: Stars Ryan Gosling and Emma Stone.");
                System.out.print("Your guess: ");
                String guess2 = sc.nextLine();
                if (guess2.equals("La la land") || guess2.equals("la la land")) {
                    System.out.println("You got it!");
                } else {
                    System.out.println("Sorry, the answer was La La Land.");
                }
            }

        } else {
            // Game 3: Book
            System.out.println("The goal of the game is to guess a word with two hints!");
            System.out.println("Game 3: Guess the book!");
            System.out.println("Hint 1: It's a dystopian novel.");
            System.out.print("Your guess: ");
            String guess1 = sc.nextLine();

            if (guess1.equals("Hunger games") || guess1.equals("hunger games")) {
                System.out.println("You got it!");
            } else {
                System.out.println("Wrong! Hint 2: Written by Suzanne Collins.");
                System.out.print("Your guess: ");
                String guess2 = sc.nextLine();
                if (guess2.equals("Hunger games") || guess2.equals("hunger games")) {
                    System.out.println("You got it!");
                } else {
                    System.out.println("Sorry, the answer was Hunger Games.");
                }
            }
        }

    }
}
