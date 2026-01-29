/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Warrior[] warriors = new Warrior[100];
        Wizard[] wizards = new Wizard[100];

        for (int i = 0; i < 100; i++) {
            warriors[i] = new Warrior("Warrior " + (i + 1));
            wizards[i] = new Wizard("Wizard " + (i + 1));
        }

        int wIndex = 0; 
        int zIndex = 0; 

        while (wIndex < 100 && zIndex < 100) {
            Wizard currentWizard = wizards[zIndex];
            Warrior currentWarrior = warriors[wIndex];

            currentWizard.attack(currentWarrior);

            if (currentWarrior.isDead()) {
                wIndex++; 
            } else {
                currentWarrior.attack(currentWizard);
                if (currentWizard.isDead()) {
                    zIndex++; 
                }
            }
        }

        if (wIndex == 100) {
            System.out.println("Wizards won! Remaining Wizards: " + (100 - zIndex));
        } else {
            System.out.println("Warriors won! Remaining Warriors: " + (100 - wIndex));
        }
    }
}