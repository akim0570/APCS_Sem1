/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Slot Machine Rules: "); 
        System.out.println("1. Each player starts with $100."); 
        System.out.println("2. Input a wager less than your total amount of money."); 
        System.out.println("3. The slot machine will roll 3 numbers from 1 to 10."); 
        System.out.println("   a. If two numbers match, you double your money."); 
        System.out.println("   b. If three numbers match, you triple your money."); 
        System.out.println("   c. If none match, you lose your money.");
        System.out.println("--------------------------------------------------\n");

        System.out.print("Would you like to play the slots? (Yes/yes/Y/y) : ");
        String answer = sc.nextLine();

        if (answer.equals("Yes") || answer.equals("yes") ||answer.equals("Y")||answer.equals("y")) {
            int money = 100;

            while (money > 0) { 
                System.out.println("You have $" + money + ".");
                System.out.print("How much would you like to wager? "); 
                int wager = sc.nextInt();
                sc.nextLine();
                
             if (wager <= 0 || wager > money) {
                System.out.println("Invalid wager. You only have $" + money + ". Please enter a smaller value.");
                continue;
            } 
             


                System.out.println("Great! Let's play!!!");
                System.out.println("Your rolls are: ");
                System.out.println("_______________________");

                
                int num1 = (int)(Math.random() * (10) + 1); 
                int num2 = (int)(Math.random() * (10) + 1); 
                int num3 = (int)(Math.random() * (10) + 1); 

                System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
                System.out.println("_______________________");

                if (num1 == num2 && num2 == num3) {
                    int winnings = wager * 3;
                    money = money + winnings;
                    System.out.println("JACKPOT! ALL three match! You win $" + winnings + "!");
                } else if (num1 == num2 || num1 == num3 || num2 == num3) {
                    int winnings = wager * 2;
                    money = money + winnings;
                    System.out.println("Nice! Two numbers match! You win $" + winnings + "!");
                } else {
                    money = money - wager;
                    System.out.println("Didn't win this time, better luck next time!");
                }

                System.out.println("You now have $" + money + ".");
                System.out.println("--------------------------------------------------");

                if (money <= 0) {
                    System.out.println("You have no money left. Thanks for coming! Come back soon!");
                    break;
                }

                System.out.print("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n): ");
                String playAgain = sc.nextLine();

                if (playAgain.equals("No") || playAgain.equals("no") || playAgain.equals("N")|| playAgain.equals("n")) {
                    System.out.println("Sad to see you go! You have $" + money + " left. Come again soon! Thanks!");
                    break;
                }
            }
        } else {
            System.out.println("Maybe next time!");
        }

    }
}