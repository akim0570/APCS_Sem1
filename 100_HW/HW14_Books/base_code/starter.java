/*
 *	Author:
 *  Date:
*/

import java.util.*;
import java.io.*;

class starter {
  public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the file name of one of the text files in the 'books' folder: (Ex: test.txt)");
        String textFile = sc.nextLine(); 
        String[] arr = fillArray(textFile); 
        System.out.println();

        while (true) {
            System.out.println("What action would you like to take?");
            System.out.println("1. Check text file (file)");
            System.out.println("2. Print the text given (print)");
            System.out.println("3. Print the text backwards (printBack)");
            System.out.println("4. Print a certain number of words (printNum)");
            System.out.println("5. Change the text file (change)");
            System.out.println("6. Check the number of words in a text (check)");
            System.out.println("7. Most common word (common)");

            String choice = sc.nextLine();
            System.out.println();

			  if (choice.equals("file")) {
			    System.out.println("Current file: " + textFile);
			} else if (choice.equals("print")) {
			    printsArray(arr);
			} else if (choice.equals("printBack")) {
			    printsArrayBack(arr);
			} else if (choice.equals("printNum")) {
			    System.out.print("How many words of the text would you like to print? ");
			    int num = sc.nextInt();
			    sc.nextLine(); 
			    printsNumber(arr, num);
			} else if (choice.equals("change")) {
			    System.out.println("Enter new file:");
			    textFile = sc.nextLine();
			    arr = fillArray(textFile);
			} else if (choice.equals("check")) {
			    System.out.print("Enter word to check: ");
			    String word = sc.nextLine();
			    int count = checksArray(arr, word);
			    System.out.println("Occurrences: " + count);
			} else if (choice.equals("common")) {
			    System.out.println("Most common word: " + mostCommon(arr));
			} else {
			    System.out.println("Invalid option.");
			}
			
			System.out.println("----------");
			}
			}

    /* ---------------------------------------------------------------------------------------
       Prints the entire array given
    */
    public static void printsArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); 
        }
    }

    /* ---------------------------------------------------------------------------------------
       Prints the entire array in reverse order
    */
    public static void printsArrayBack(String[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " "); 
        }
    }

    /* ---------------------------------------------------------------------------------------
       Prints "num" words from the array.
       If num is too large, prints an error and ends method.
    */
    public static void printsNumber(String[] arr, int num) {
        System.out.println("--------Printing " + num + " Number of Words ----------");
        System.out.println("-------------");

        if (num > arr.length) {
            System.out.println("Too large of a number. Please try again.");
            return;
        }

        for (int i = 0; i < num; i++) {
            System.out.println(arr[i]);
        }
    }

    /* ---------------------------------------------------------------------------------------
       Counts the occurrences of a word in the array
    */
    public static int checksArray(String[] arr, String check) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(check)) {  
                count++;
            }
        }
        return count;
    }

    /* ---------------------------------------------------------------------------------------
       Finds the most common word in the array
    */
    public static String mostCommon(String[] arr) {
        String mostCommonWord = arr[0];
        int highestCount = 0;

        for (int i = 0; i < arr.length; i++) {
            String currentWord = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j].equals(currentWord)) {  
                    count++;
                }
            }

            if (count > highestCount) {
                highestCount = count;
                mostCommonWord = currentWord;
            }
        }

        return mostCommonWord;
    }

    /* ---------------------------------------------------------------------------------------
       Provided: fills array with all words from text file
    */
    public static String[] fillArray(String arg) throws FileNotFoundException {
        File text = new File("./books/" + arg);
        Scanner sc = new Scanner(text);
        int lineNumber = 0;
        while (sc.hasNext()) {
            sc.next();
            lineNumber++;
        }

        String[] arr = new String[lineNumber];
        sc = new Scanner(text);
        for (int i = 0; i < lineNumber; i++) {
            arr[i] = sc.next();
        }
        return arr;
    }
}