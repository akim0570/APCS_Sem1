/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;
import pkg.*;

import java.util.Scanner;

class Starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter difficulty level (1, 2, 3):");
        int diff = sc.nextInt();
        sc.nextLine();

        int round = 1;
        boolean lost = false;

        while (!lost) {
            System.out.println("\n=== Round " + round + " ===\n");

            String[] words = new String[round];
            String[] textColors = new String[round];
            String[] bgColors = new String[round];
            int[] checkType = new int[round];

          for (int i = 0; i < round; i++) {
        String word = getColorWord();
        String textColor = "BRIGHT_" + word.toUpperCase();
        String bgColor = "BG_" + word.toUpperCase();
        int type;
    
        if (diff == 1) {
            type = 0;
        } else if (diff == 2) {
            type = (int)(Math.random() * 2);
        } else {
            type = (int)(Math.random() * 3);
        }
    
        System.out.print("Color " + (i + 1) + ": ");
    
        if (diff == 1) {
            System.out.println(word);
        } else if (diff == 2) {
            System.out.println(word + " (" + textColor + ")");
        } else {
            System.out.println(word + " (" + textColor + ", " + bgColor + ")");
        }
    }
            System.out.println("\nMemorize the sequence!");
            clearScreen();

            lost = false;
            for (int i = 0; i < round; i++) {
                System.out.print("Enter color " + (i + 1) + ": ");
                String input = sc.nextLine();
                String correct = words[i]; 
            
            if (checkType[i] == 1) {
                correct = getSimpleColorName(textColors[i]);
            } else if (checkType[i] == 2) {
                correct = getSimpleColorName(bgColors[i]);
            }

                if (!input.equalsIgnoreCase(correct)) { 
                    lost = true;
                }
            }

            if (lost) {
                System.out.print("\nYou lost! Correct sequence was: ");
                for (int i = 0; i < round; i++) {
                    System.out.print(words[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println("\nCorrect! Next round...");
                round++;
            }
        }

        sc.close();
    }

    public static String getColorWord() {
        String[] colors = {"Purple","Red","Green","Yellow","Blue"};
        int index = (int)(Math.random() * colors.length);
        return colors[index];
    }

    public static void clearScreen() {
        for (int i = 0; i < 50; i++) 
        System.out.println();
    }

    public static String getSimpleColorName(String s) {
        s = s.toUpperCase();

        if (s.equals("BRIGHT_BG_RED")) {
        return "RED";
    }

    if (s.equals("BRIGHT_BG_BLUE")) {
        return "BLUE";
    }

    if (s.equals("BRIGHT_BG_GREEN")) {
        return "GREEN";
    }

    if (s.equals("BRIGHT_RED")) {
        return "RED";
    }

    if (s.equals("BG_BLUE")) {
        return "BLUE";
    }

    if (s.equals("GREEN")) {
        return "GREEN";
    }

    if (s.equals("YELLOW")) {
        return "YELLOW";
    }

    if (s.equals("PURPLE")) {
        return "PURPLE";
    }

    return s;
    }
}