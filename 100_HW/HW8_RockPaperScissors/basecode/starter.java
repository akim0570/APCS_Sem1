/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String play = "";

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (true) {
            System.out.println("--------------------------------------------------------------");
            System.out.println("Would you like to play the computer? (yes/no/done)");
            play = sc.nextLine();

            if (play.equals("done")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            else if (play.equals("yes")) {
                String playerChoice = "";
                while (true) {
                    System.out.println("--------------------------------------------------------------");
                    System.out.println("Please enter one of the following: rock, paper, scissors");
                    playerChoice = sc.nextLine();
                    if (playerChoice.equals("rock") || playerChoice.equals("paper") || playerChoice.equals("scissors")) {
                        break;
                    } else {
                        System.out.println("Invalid input, please type exactly rock, paper, or scissors:");
                    }
                }

                String computerChoice = getObject(); 
                int result = compare2(playerChoice, computerChoice);

                if (result == 0) {
                    System.out.println("You tied!");
                } 
                else if (result == 1) {
                    System.out.println("You won!!!");
                } 
                else {
                    System.out.println("Computer wins!!!");
                }
            }

            else if (play.equals("no")) {
                System.out.println("--------------------------------------------------------------");
                System.out.println("How many times would you like the computer to play itself?");
                int times = sc.nextInt();
                sc.nextLine(); 

                int p1Wins = 0;
                int p2Wins = 0;
                int ties = 0;

                int i = 0;
                while (i < times) {
                    int result = compare2(getObject(), getObject());
                    if (result == 0) {
                        ties++;
                    } 
                    else if (result == 1) {
                        p1Wins++;
                    } 
                    else {
                        p2Wins++;
                    }
                    i++;
                }

                System.out.println("Player 1 wins: " + p1Wins);
                System.out.println("Player 2 wins: " + p2Wins);
                System.out.println("Ties: " + ties);
            }

            else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("You typed an invalid input! Please type exactly yes, no, or done.");
            }
        }
    }

    public static String getObject() {
        int rand = (int)(Math.random() * 3);
        if (rand == 0) {
            return "rock";
        } 
        else if (rand == 1) {
            return "paper";
        } 
        else {
            return "scissors";
        }
    }

    public static int compare2(String p1, String p2) {
        if (p1.equals(p2)) {
            return 0;
        }
        if ((p1.equals("rock") && p2.equals("scissors")) ||
            (p1.equals("paper") && p2.equals("rock")) ||
            (p1.equals("scissors") && p2.equals("paper"))) {
            return 1;
        } 
        else {
            return 2;
        }
    }
}
