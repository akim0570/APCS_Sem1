package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog() {
        this.name = "Clifford";
        this.age = 3;
        this.breed = "big red dog";
    }

    public Dog(String name) {
        this.name = name;
        this.age = 1;
        this.breed = "dog dog";
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
        this.age = 1;
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.breed = "dog dog";
    }

    public void setName(String name) { 
        this.name = name; 
        
    }
    public void setAge(int age) { 
        this.age = age; 
        
    }
    public void setBreed(String breed) { 
        this.breed = breed; 
        
    }

    public String getName() { 
        return name;
        }
    public int getAge() { 
        return age; 
        
    }
    public String getBreed() { 
        return breed; 
        
    }

    public boolean isSleeping() {
        Random rand = new Random(); 
        return rand.nextBoolean();
    }

    public void bark() {
        System.out.println(name + " barks!");
    }
}
