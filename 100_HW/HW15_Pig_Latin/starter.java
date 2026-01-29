/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a sentence: ");
        String a = sc.nextLine();

        String result = "";

        while(a.indexOf(" ") != -1) { 
            String word = a.substring(0, a.indexOf(" ")); 
            result += toPigLatin(word) + " "; 
            a = a.substring(a.indexOf(" ") + 1); 
        }

        result += toPigLatin(a);

        System.out.println(result);
    }

    public static String toPigLatin(String word) {
        String vowels = "aeiou";

        String first = word.substring(0, 1);
        String second = "";
        if (word.length() > 1) {
            second = word.substring(1, 2);
        }

        if (vowels.contains(first)) {
            return word + "-way";
        } 
        else if (!vowels.contains(first) && !vowels.contains(second)) {
            return word.substring(2) + "-" + first + second + "ay";
        } 
        else {
            return word.substring(1) + "-" + first + "ay";
        }
    }
}