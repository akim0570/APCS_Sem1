/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Welcome player to Battle of Ministry of Magic! We need some information to make you! First, please tell me your name!");
	    String name = sc.nextLine();
	    System.out.println("Next what is character title? Ex: Slayer of Dragons");
	    String title = sc.nextLine();
	    System.out.println("Would you like to be a Dark Arts Specialist, Auror, or Potion Master?");
	    String role = sc.nextLine();
	    
	    if (role.equals("Dark Arts Specialist")|| role.equals("dark arts specialist")){
	    	System.out.println("");
	    	System.out.println("You have chosen the Dark Arts Specialist! Following in Lord Voldermort's footstep?!");
	    	System.out.println("");

	    }
	    else if (role.equals("Auror")|| role.equals("auror")){
	    	System.out.println("");
	    	System.out.println("You have chosen the Auror! Following in Alastor Moody's footstep?!");
	    	System.out.println("");

	    }
	    else if (role.equals("Potion Master")|| role.equals("potion master")){
	    	System.out.println("");
	    	System.out.println("You have chosen the Potion Master! Following in Serverus Snape's footstep?!");
	    	System.out.println("");

	    }
	    else{
	    	System.out.println("You have entered a invalid role. Retype it, please!");
	    	System.out.println("Would you like to be a Dark Arts Specialist, Auror, or Potion Master?");
	        role = sc.nextLine();
	    }
	    
	    System.out.println("You have 20 skills to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely!");
	    System.out.println("");
	    
	    System.out.print("Strength (1-10): ");
	    int strength1 = sc.nextInt();
	    if((strength1>10) || (strength1 < 0 )){
	        System.out.println("Please input a smaller number!");
	        System.out.print("Strength (1-10): ");
	        strength1 = sc.nextInt();
	    }
	    int strength = 20 - strength1;
	    System.out.println("You have "+ strength +" left to spend");
	    System.out.println("");
	    
	    System.out.print("Dexterity (1-10): ");
	    int dexterity1 = sc.nextInt();
	    if(dexterity1>strength || dexterity1 < 0 ){
	        System.out.println("Please input a smaller number!");
	        System.out.print("Dexterity (1-10): ");
	        dexterity1 = sc.nextInt();
	    }
	    int dexterity =  strength - dexterity1;
	    System.out.println("You have "+ dexterity +" left to spend");
	    System.out.println("");
	    
	    System.out.print("Intelligence (1-10): ");
	    int intelligence1 = sc.nextInt();
	    if (intelligence1>dexterity || intelligence1<0){
	        System.out.println("Please input a smaller number!");
	        System.out.print("Intelligence (1-10): ");
	        intelligence1 = sc.nextInt();
	    }
	    int intelligence = dexterity - intelligence1;
	    System.out.println("You have "+ intelligence +" left to spend");
	    System.out.println("");

	    System.out.print("Charisma (1-10): ");
	    int charisma1 = sc.nextInt();
	    if (charisma1>intelligence  || charisma1<0){
	        System.out.println("Please input a smaller number!");
	        System.out.print("Charisma (1-10): ");
	        charisma1 = sc.nextInt();
	    }
	    int charisma = intelligence - charisma1;
	    System.out.println("You have "+ charisma +" left to spend");
	    System.out.println("");
	    
	    if (charisma > 0){
	    	System.out.println("You have " + charisma + " to spend for next time.");
	    	System.out.println("");
	    }
	    
	    
	    System.out.println("----------------------------------------------");
	    System.out.println("You are " + name + ", [the] " + title + ".");
	    System.out.println("You are a "+ role+ " with the following stats!");
	    System.out.println("Strength - "+ strength1); 
	    System.out.println("Dexterity - "+ dexterity1); 
        System.out.println("Intelligence - "+ intelligence1); 
        System.out.println("Charisma - "+ charisma1); 
        System.out.println("");
        System.out.println("");
        System.out.println("Good luck fellow wizards or witchs in your journey in the Battle of Ministry of Magic!");

	}
}
