import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
			
        }
			int s1 = 0, s2 = 0, s3 = 0;
			
        for (i = 0; i < passwords.length; i++){
            String p = passwords[i];

            if (p.length() >= 8 && (p.contains("!") || p.contains("@") || p.contains("$") || 
                p.contains("%") || p.contains("^") || p.contains("&") || p.contains("*"))){
                s3++;
            }
            else if (p.length() >= 8){
                s1++;
            }
            else if (p.contains("!") || p.contains("@") || p.contains("$") || 
                     p.contains("%") || p.contains("^") || p.contains("&") || p.contains("*")){
                s2++;
            }
        }

            System.out.println("Strength 1 - " + s1);
            System.out.println("Strength 2 - " + s2);
            System.out.println("Strength 3 - " + s3);
            System.out.println("No Strength - " + (passwords.length - s1 - s2 - s3));
        
	}
}