/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman spidey1 = new Spiderman();
		Spiderman tobey = new Spiderman("Tobey Maguire", 48 , "Green Goblin");
		Spiderman andrew = new Spiderman("Andrew Garfield", 40 , "Electro");
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman gwen = new Spiderman("Gwen Stacy", 17, "Kingpin");
		
        tobey.fight();
        andrew.fight();
        tom.fight();

        System.out.println(tobey.getActor() + " fights " + tobey.getVillain());
        System.out.println(andrew.getActor() + " fights " + andrew.getVillain());
        System.out.println(tom.getActor() + " fights " + tom.getVillain());
		
		tobey.printArt();


	}
}
