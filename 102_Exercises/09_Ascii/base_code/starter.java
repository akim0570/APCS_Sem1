/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please pick an ASCII Art of an animal, object, or face! ");
        String answer = sc.nextLine();

        if (answer.equals("Animal") || answer.equals("animal")) {
            System.out.println("  |\\__//,|   (`\\ ");
            System.out.println(" _.|o o  |_   ) )");
            System.out.println("-(((---(((--------");
        }

        if (answer.equals("Object") || answer.equals("object")) {
            System.out.println("      ______");
            System.out.println("  ___/      \\___");
            System.out.println(" /              \\");
            System.out.println("|   _   __   _   |");
            System.out.println("'- (o)------(o) -'");
        }

        if (answer.equals("Face") || answer.equals("face")) {
            System.out.println(" ///-\\\\\"");
            System.out.println(" |^   ^|");
            System.out.println(" |O   O|");
            System.out.println(" |  -  |");
            System.out.println("  \\ O //");
            System.out.println("   | |");
        }
    }
}
