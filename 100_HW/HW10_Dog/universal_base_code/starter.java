/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

        System.out.println("Dog name?");
        String firstDogName = sc.nextLine();
        Dog dog1 = new Dog(firstDogName);

        System.out.println("What age should " + dog1.getName() + " be?");
        int age = sc.nextInt();
        dog1.setAge(age);

        Dog dog2 = new Dog("Decoy", "Dutch Kooikerhondje");

        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");

        boolean dog1Sleeping = dog1.isSleeping();
        boolean dog2Sleeping = dog2.isSleeping();
        boolean dog1Barked = false;

        if (dog1Sleeping) {
            System.out.println(dog1.getName() + " is sleeping! Don't wake " + dog1.getName() + " up!");
        } else {
            dog1.bark();
            dog1Barked = true;
        }

        if (dog2Sleeping) {
            System.out.println(dog2.getName() + " is sleeping too!");
            if (dog1Barked) {
                System.out.println(dog2.getName() + " wakes up from hearing " + dog1.getName());
                dog2.bark();
            }
        } else {
            if (dog1Barked) {
                dog2.bark();
            }
        }

    }
}