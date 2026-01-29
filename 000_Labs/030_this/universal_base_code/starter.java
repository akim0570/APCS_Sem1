/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

    public static void main(String args[]) {
        String target = randName(); 
        int count = 0;
        int total = 100;
        int i = 0; 

        while(i < total) { 
            if(randName().equals(target)) { 
                count++;
            }
            i++;
        }

        System.out.println(target + " was the name with " + count + " matches!");
    }
}












